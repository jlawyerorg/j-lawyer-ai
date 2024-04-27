/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.HashMap;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.processing.AiProcessorException;
import org.jlawyer.ai.utils.AiFileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement(name = "file2string-processor")
public class FileToStringProcessor extends Processor {

    private static final Logger log = LoggerFactory.getLogger(FileToStringProcessor.class);

    private String inputFile;
    private String outputStringId;

    @Override
    public void process(String requestId, AiRequest aiRequest, HashMap<String, File> inputFiles, HashMap<String, String> inputStrings) throws AiProcessorException {

        File workingDir = new File("processing" + File.separator + requestId);
        if (!workingDir.exists()) {
            workingDir.mkdirs();
        }

        try {
            String text=AiFileUtils.readFileAsString(new File(workingDir + File.separator + inputFile));
            inputStrings.put(outputStringId, text);
        } catch (Exception ex) {
            log.error("Request " + requestId + ", command threw exception", ex);
            throw new AiProcessorException("Request " + requestId + ", command threw exception: " + ex.getMessage());
        }

    }

    /**
     * @return the inputString
     */
    @XmlAttribute(name = "inputfile")
    public String getInputFile() {
        return inputFile;
    }

    /**
     * @param inputFile the inputFile to set
     */
    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * @return the outputStringId
     */
    @XmlAttribute(name = "outputstringid")
    public String getOutputString() {
        return outputStringId;
    }

    /**
     * @param outputStringId the outputString to set
     */
    public void setOutputString(String outputStringId) {
        this.outputStringId = outputStringId;
    }

}
