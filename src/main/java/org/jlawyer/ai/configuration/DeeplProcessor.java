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
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.model.ParameterData;
import org.jlawyer.ai.processing.AiProcessorException;
import org.jlawyer.ai.utils.AiFileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement(name = "deepl-processor")
public class DeeplProcessor extends Processor {

    private static final Logger log = LoggerFactory.getLogger(DeeplProcessor.class);

    private String apiKey;
    private String targetLanguage;
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

        for (String key : inputStrings.keySet()) {
            if (input.contains(key)) {
                inputText = inputStrings.get(key);
                usedKey=key;
                break;
            }

        }

        try {
            URL url = new URL(getEndpoint());
            Map<String, Object> params = new LinkedHashMap<>();

            params.put("text", inputText);

            String targetLang=this.getTargetLanguage();
            for(ParameterData p: aiRequest.getParameterData()) {
                targetLang=targetLang.replace(p.getId(), p.getValue());
            }
            params.put("target_lang", targetLang);

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }

            byte[] postDataBytes = postData.toString().getBytes("UTF-8");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "DeepL-Auth-Key " + getApiKey());
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
            String translated = jsonObject.getAsJsonArray("translations").get(0).getAsJsonObject().get("text").getAsString();
            
            inputStrings.put(this.getOutput(), translated);

        } catch (Exception ex) {
            log.error("Request " + requestId + ", command threw exception", ex);
            throw new AiProcessorException("Request " + requestId + ", command threw exception: " + ex.getMessage());
        }

    }

    /**
     * @return the apiKey
     */
    @XmlAttribute(name = "api-key")
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey the apiKey to set
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return the targetLanguage
     */
    @XmlAttribute(name = "target-language")
    public String getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * @param targetLanguage the targetLanguage to set
     */
    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
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

}
