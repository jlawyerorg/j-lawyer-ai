/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.processing.AiProcessorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement(name = "commandline-processor")
public class CommandlineProcessor extends Processor {

    private static final Logger log = LoggerFactory.getLogger(CommandlineProcessor.class);

    private String binary;

    private String arguments;

    // Getters and setters with XmlElement annotations
    /**
     * @return the binary
     */
    @XmlAttribute
    public String getBinary() {
        return binary;
    }

    /**
     * @param binary the binary to set
     */
    public void setBinary(String binary) {
        this.binary = binary;
    }

    /**
     * @return the arguments
     */
    @XmlAttribute
    public String getArguments() {
        return arguments;
    }

    /**
     * @param arguments the arguments to set
     */
    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    @Override
    public void process(String requestId, Backend backend, AiRequest aiRequest, HashMap<String, File> inputFiles, HashMap<String, String> inputStrings) throws AiProcessorException {

        String commandLine = binary + " " + arguments;
        
        String[] cmd = commandLine.split(" ");
        for (int i = 0; i < cmd.length; i++) {
            for (String key : inputFiles.keySet()) {

                if (cmd[i].contains(key)) {
                    String dir = inputFiles.get(key).getParent();
                    String file = inputFiles.get(key).getName();

                    cmd[i] = dir + File.separator + cmd[i].replace(key, file);
                }

            }
        }
        
        for (int i = 0; i < cmd.length; i++) {
            for (String key : inputStrings.keySet()) {

                if (cmd[i].contains(key)) {

                    cmd[i] = cmd[i].replace(key, inputStrings.get(key));
                }

            }
        }

        log.info("Request " + requestId + ", processing command line: " + commandLine);

        int exitCode = 0;
        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
        processBuilder.redirectErrorStream(true); // Redirect standard error to standard output

        log.info("Request " + requestId + ", output:");
        try {
            Process process = processBuilder.start();

            // Read standard output and standard error streams
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                log.info("   " + line);
            }
            
//            int character;
//            StringBuilder lineBuilder = new StringBuilder();
//            while ((character = reader.read()) != -1) {
//                if (character == '\n') {
//                    log.info("   " + lineBuilder.toString());
//                    lineBuilder.setLength(0); // Clear StringBuilder for next line
//                } else {
//                    lineBuilder.append((char) character);
//                }
//            }

            // Wait for the process to finish and get the exit code
            exitCode = process.waitFor();
            log.info("Request " + requestId + ", exit code :" + exitCode);
        } catch (IOException | InterruptedException ex) {
            log.error("Request " + requestId + ", command threw exception", ex);
            exitCode = -1; // Set a custom exit code to indicate an error
            throw new AiProcessorException("Request " + requestId + ", command threw exception: " + ex.getMessage());
        }

    }

}
