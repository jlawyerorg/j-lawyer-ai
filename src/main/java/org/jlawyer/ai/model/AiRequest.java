/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jens
 */
public class AiRequest {
    
    private String prompt;
    private List<ParameterData> parameterData=new ArrayList<>();
    private List<InputData> inputData=new ArrayList<>();
    private String requestType;
    private String modelType;

    /**
     * @return the prompt
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * @param prompt the prompt to set
     */
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    /**
     * @return the inputData
     */
    public List<InputData> getInputData() {
        return inputData;
    }

    /**
     * @return the requestType
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * @param requestType the requestType to set
     */
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    /**
     * @return the modelType
     */
    public String getModelType() {
        return modelType;
    }

    /**
     * @param modelType the modelType to set
     */
    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * @return the parameterData
     */
    public List<ParameterData> getParameterData() {
        return parameterData;
    }

    /**
     * @param parameterData the parameterData to set
     */
    public void setParameterData(List<ParameterData> parameterData) {
        this.parameterData = parameterData;
    }
    
}
