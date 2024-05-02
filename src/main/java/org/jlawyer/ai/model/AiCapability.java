/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.model;

import java.util.ArrayList;
import java.util.List;
import org.jlawyer.ai.configuration.Input;
import org.jlawyer.ai.configuration.Output;
import org.jlawyer.ai.configuration.Parameter;
import org.jlawyer.ai.configuration.Prompt;

/**
 *
 * @author jens
 */
public class AiCapability {
    
    private String name;
    private String description;
    private String requestType;
    private String modelType;
    private boolean async=false;
    
    private Prompt defaultPrompt=null;
    
    private List<Parameter> parameters=new ArrayList<>();
    
    private List<Input> input=new ArrayList<>();
    
    private List<Output> output=new ArrayList<>();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the async
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * @param async the async to set
     */
    public void setAsync(boolean async) {
        this.async = async;
    }

    /**
     * @return the defaultPrompt
     */
    public Prompt getDefaultPrompt() {
        return defaultPrompt;
    }

    /**
     * @param defaultPrompt the defaultPrompt to set
     */
    public void setDefaultPrompt(Prompt defaultPrompt) {
        this.defaultPrompt = defaultPrompt;
    }

    /**
     * @return the parameters
     */
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * @return the input
     */
    public List<Input> getInput() {
        return input;
    }

    /**
     * @param input the input to set
     */
    public void setInput(List<Input> input) {
        this.input = input;
    }

    /**
     * @return the output
     */
    public List<Output> getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(List<Output> output) {
        this.output = output;
    }
    
    
}
