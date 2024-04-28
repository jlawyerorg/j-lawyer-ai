/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.processing.AiProcessorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement(name = "string2file-processor")
public class StringToFileProcessor extends Processor {

    private static final Logger log = LoggerFactory.getLogger(StringToFileProcessor.class);

    private String inputString;
    private String outputFile;
    private String outputFileId;

    @Override
    public void process(String requestId, Backend backend, AiRequest aiRequest, HashMap<String, File> inputFiles, HashMap<String, String> inputStrings) throws AiProcessorException {

        File workingDir = new File("processing" + File.separator + requestId);
        if (!workingDir.exists()) {
            workingDir.mkdirs();
        }

        try {
            FileWriter fw = new FileWriter(workingDir + File.separator + outputFile);
            String s=inputString;
            s=s.replace("PROMPT", aiRequest.getPrompt());
            for(String k: inputStrings.keySet()) {
                s=s.replace(k, inputStrings.get(k));
            }
            fw.write(s);
            fw.close();
            inputFiles.put(this.outputFileId, new File(workingDir + File.separator + outputFile));
        } catch (IOException ex) {
            log.error("Request " + requestId + ", command threw exception", ex);
            throw new AiProcessorException("Request " + requestId + ", command threw exception: " + ex.getMessage());
        }

    }

    /**
     * @return the inputString
     */
    @XmlAttribute(name = "inputstring")
    public String getInputString() {
        return inputString;
    }

    /**
     * @param inputString the inputString to set
     */
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    /**
     * @return the outputFile
     */
    @XmlAttribute(name = "outputfile")
    public String getOutputFile() {
        return outputFile;
    }

    /**
     * @param outputFile the outputFile to set
     */
    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    /**
     * @return the outputFileId
     */
    @XmlAttribute(name = "outputfileid")
    public String getOutputFileId() {
        return outputFileId;
    }

    /**
     * @param outputFileId the outputFileId to set
     */
    public void setOutputFileId(String outputFileId) {
        this.outputFileId = outputFileId;
    }

}
