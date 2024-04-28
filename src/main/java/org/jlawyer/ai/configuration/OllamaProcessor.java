/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.processing.AiProcessorException;
import org.jlawyer.ai.utils.AiFileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement(name = "ollama-processor")
public class OllamaProcessor extends Processor {

    private static final Logger log = LoggerFactory.getLogger(OllamaProcessor.class);

    private String model;
    private String input;
    private String output;
    private String endpoint;

    @Override
    public void process(String requestId, Backend backend, AiRequest aiRequest, HashMap<String, File> inputFiles, HashMap<String, String> inputStrings) throws AiProcessorException {

        String inputText = null;
        
        String usedKey=null;

        for (String key : inputFiles.keySet()) {
            if (input.contains(key)) {
                String dir = inputFiles.get(key).getParent();
                String file = inputFiles.get(key).getName();

                String readFile = dir + File.separator + input.replace(key, file);
                try {
                    inputText = AiFileUtils.readFileAsString(new File(readFile));
                    usedKey=key;
                    break;
                } catch (Exception ex) {
                    log.error("unable to read from " + readFile);
                    throw new AiProcessorException("unable to read from " + readFile);
                }
            }

        }

        if(usedKey==null) {
        inputText=input;
            inputText=inputText.replace("PROMPT", aiRequest.getPrompt());
            for(String k: inputStrings.keySet()) {
                inputText=inputText.replace(k, inputStrings.get(k));
            }
        }
        
        int tokens=Prompt.countTokens(inputText);
        if(tokens>backend.getPrompt().getMaxTokens()) {
            throw new AiProcessorException("prompt exceeded number of maximum tokens: " + tokens + " of max allowed " + backend.getPrompt().getMaxTokens());
        }
        
//        for (String key : inputStrings.keySet()) {
//            if (input.contains(key)) {
//                inputText = inputStrings.get(key);
//                usedKey=key;
//                break;
//            }
//
//        }
//        inputText=inputText.replace("PROMPT", aiRequest.getPrompt());

        try {
            URL url = new URL(getEndpoint());
            
            StringBuilder postData = new StringBuilder();
            postData.append("{\n"
                    + "  \"model\": \"" + model + "\",\n"
                    + "  \"prompt\": \"" + escapeStringToJson(inputText) + "\",\n"
                    + "  \"stream\": false\n"
                    + "}");

            byte[] postDataBytes = postData.toString().getBytes("UTF-8");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.getOutputStream().write(postDataBytes);

            Reader inReader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

            StringBuilder sb = new StringBuilder();
            for (int c; (c = inReader.read()) >= 0;) {
                sb.append((char) c);
            }
            String responseString = sb.toString();

            Gson gson = new Gson();

            // Parse the JSON string into a JsonObject
            JsonObject jsonObject = gson.fromJson(responseString, JsonObject.class);

            // Read the "text" attribute
            String response = jsonObject.getAsJsonObject().get("response").getAsString();
            
            inputStrings.put(this.getOutput(), response);

        } catch (Exception ex) {
            log.error("Request " + requestId + ", command threw exception", ex);
            throw new AiProcessorException("Request " + requestId + ", command threw exception: " + ex.getMessage());
        }

    }

    /**
     * @return the apiKey
     */
    @XmlAttribute(name = "model")
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the input
     */
    @XmlAttribute
    public String getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(String input) {
        this.input = input;
    }

    /**
     * @return the endpoint
     */
    @XmlAttribute
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * @param endpoint the endpoint to set
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * @return the output
     */
    @XmlAttribute
    public String getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(String output) {
        this.output = output;
    }
    
    private static String escapeStringToJson(String input) {
        StringBuilder builder = new StringBuilder();
        //builder.append('"');
        for (char c : input.toCharArray()) {
            switch (c) {
                case '"':
                    builder.append("\\\"");
                    break;
                case '\\':
                    builder.append("\\\\");
                    break;
                case '\b':
                    builder.append("\\b");
                    break;
                case '\f':
                    builder.append("\\f");
                    break;
                case '\n':
                    builder.append("\\n");
                    break;
                case '\r':
                    builder.append("\\r");
                    break;
                case '\t':
                    builder.append("\\t");
                    break;
                default:
                    if (Character.isISOControl(c)) {
                        builder.append("\\u").append(String.format("%04x", (int) c));
                    } else {
                        builder.append(c);
                    }
            }
        }
        //builder.append('"');
        return builder.toString();
    }

}
