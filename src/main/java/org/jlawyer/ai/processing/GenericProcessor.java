/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.processing;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import java.util.HashMap;
import org.jlawyer.ai.configuration.Backend;
import org.jlawyer.ai.configuration.CommandlineProcessor;
import org.jlawyer.ai.configuration.Output;
import org.jlawyer.ai.configuration.FileOutput;
import org.jlawyer.ai.configuration.Processor;
import org.jlawyer.ai.configuration.StringOutput;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.model.AiRequestStatus;
import org.jlawyer.ai.model.AiResponse;
import org.jlawyer.ai.model.InputData;
import org.jlawyer.ai.model.OutputData;
import org.jlawyer.ai.utils.AiFileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jens
 */
public class GenericProcessor implements RequestProcessor {

    private static final Logger log = LoggerFactory.getLogger(GenericProcessor.class);

    private Backend backend = null;

    public GenericProcessor(Backend backend) {
        this.backend = backend;
    }

    @Override
    public boolean isAsync() {
        return backend.isAsync();
    }

    @Override
    public AiResponse processSync(String requestId, AiRequest aiRequest) throws AiProcessorException {

        long start=System.currentTimeMillis();
        
        if(aiRequest.getPrompt()==null || "".equals(aiRequest.getPrompt()) && backend.getPrompt()!=null)
            aiRequest.setPrompt(backend.getPrompt().getDefaultPrompt());
        if(aiRequest.getPrompt()==null)
            aiRequest.setPrompt("");
        
        File workingDir = new File("processing" + File.separator + requestId);
        if (!workingDir.exists()) {
            workingDir.mkdirs();
        }

        // store any potential input files
        HashMap<String, File> inputFiles = new HashMap<>();
        HashMap<String, String> inputStrings = new HashMap<>();
        int fileIndex = 0;
        int stringIndex = 0;
        for (InputData input : aiRequest.getInputData()) {
            if ("file".equalsIgnoreCase(input.getType()) && input.isBase64Encoded()) {
                String fileName = input.getFileName();
                try {

                    String base64 = input.getData();
                    byte[] data = Base64.getDecoder().decode(base64);
                    File inputFile = new File(workingDir + File.separator + fileName);
                    FileOutputStream fout = new FileOutputStream(inputFile);
                    fout.write(data);
                    fout.close();
                    inputFiles.put("FILE-" + fileIndex, inputFile);
                    fileIndex++;
                } catch (Exception ex) {
                    log.error("Could not write input file " + fileName, ex);
                    throw new AiProcessorException("Could not write input file " + fileName + ": " + ex.getMessage());

                }
            } else if ("string".equalsIgnoreCase(input.getType())) {
                inputStrings.put("STRING-" + stringIndex, input.getData());
            }
        }

        for (Processor p : this.backend.getProcessing().getPreProcessors()) {
            p.process(requestId, this.backend, aiRequest, inputFiles, inputStrings);
        }
        for (Processor p : this.backend.getProcessing().getProcessors()) {
            p.process(requestId, this.backend, aiRequest, inputFiles, inputStrings);
        }
        for (Processor p : this.backend.getProcessing().getPostProcessors()) {
            p.process(requestId, this.backend, aiRequest, inputFiles, inputStrings);
        }

        AiResponse response = new AiResponse();
        for (Output o : backend.getOutput()) {
            if (o instanceof FileOutput) {
                String outputId = ((FileOutput) o).getId();

                for (String key : inputFiles.keySet()) {

                    if (outputId.contains(key)) {
                        String dir = inputFiles.get(key).getParent();
                        String file = inputFiles.get(key).getName();

                        String outFile = dir + File.separator + outputId.replace(key, file);
                        try {
                            byte[] fileBytes = AiFileUtils.readFile(new File(outFile));

                            OutputData od = new OutputData();
                            od.setFileName(outputId.replace(key, file));
                            od.setBase64Encoded(true);
                            od.setData(Base64.getEncoder().encodeToString(fileBytes));
                            od.setType("file");

                            response.getOutputData().add(od);
                            break;

                        } catch (Exception ex) {
                            log.error("Could not read output file " + outFile, ex);
                            throw new AiProcessorException("Could not read output file " + outFile + ": " + ex.getMessage());
                        }

                    }

                }

            } else if (o instanceof StringOutput) {
                String outputId = ((StringOutput) o).getId();

                for (String key : inputFiles.keySet()) {

                    if (outputId.contains(key)) {
                        String dir = inputFiles.get(key).getParent();
                        String file = inputFiles.get(key).getName();

                        String outFile = dir + File.separator + outputId.replace(key, file);
                        try {
                            String fileText = AiFileUtils.readFileAsString(new File(outFile));

                            OutputData od = new OutputData();
                            od.setFileName(null);
                            od.setBase64Encoded(false);
                            od.setData(fileText);
                            od.setType("string");

                            response.getOutputData().add(od);
                            break;

                        } catch (Exception ex) {
                            log.error("Could not read output file " + outFile, ex);
                            throw new AiProcessorException("Could not read output file " + outFile + ": " + ex.getMessage());
                        }

                    }

                }

                for (String key : inputStrings.keySet()) {
                    if (key.equals(outputId)) {
                        OutputData od = new OutputData();
                        od.setFileName(null);
                        od.setBase64Encoded(false);
                        od.setData(inputStrings.get(key));
                        od.setType("string");
                        response.getOutputData().add(od);
                    }
                }
            }
        }

        response.setExecutionMillis(System.currentTimeMillis()-start);
        response.setModelType(backend.getModelType());
        response.setProgress(100f);
        response.setPrompt("");
        response.setRequestId(requestId);
        response.setRequestType(backend.getRequestType());
        response.setStatus("FINISHED");
        response.setStatusMessage("finished processing");
        return response;
    }

    @Override
    public void processAsync(String requestId, AiRequest aiRequest) throws AiProcessorException {

    }

    @Override
    public AiRequestStatus getStatus(String requestId) throws AiProcessorException {
        return null;
    }

    @Override
    public AiResponse getResponse(String requestId) throws AiProcessorException {
        return null;
    }

}
