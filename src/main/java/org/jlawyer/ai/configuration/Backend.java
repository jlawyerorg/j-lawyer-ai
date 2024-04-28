/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "backend")
public class Backend {
    private String name;
    private String description;
    private String requestType;
    private String modelType;
    private boolean async=false;
    
    private Prompt prompt=null;
    
    private List<Parameter> parameters=new ArrayList<>();
    
    private List<Input> input=new ArrayList<>();
    private Processing processing;
    
    
    private List<Output> output=new ArrayList<>();

    // Getters and setters with XmlElement annotations

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
    @XmlElement(name = "request-type")
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
    @XmlElement(name = "model-type")
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
     * @return the input
     */
    @XmlElementWrapper(name = "input")
    @XmlElements({
            @XmlElement(name = "file", type = FileInput.class),
            @XmlElement(name = "string", type = StringInput.class)
    })
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
     * @return the processing
     */
    public Processing getProcessing() {
        return processing;
    }

    /**
     * @param processing the processing to set
     */
    public void setProcessing(Processing processing) {
        this.processing = processing;
    }

    /**
     * @return the output
     */
    @XmlElementWrapper(name = "output")
    @XmlElements({
            @XmlElement(name = "file", type = FileOutput.class),
            @XmlElement(name = "string", type = StringOutput.class)
    })
    public List<Output> getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(List<Output> output) {
        this.output = output;
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
     * @return the prompt
     */
    @XmlElement(name = "prompt")
    public Prompt getPrompt() {
        return prompt;
    }

    /**
     * @param prompt the prompt to set
     */
    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }

    /**
     * @return the parameters
     */
    @XmlElementWrapper(name = "parameters")
    @XmlElements({
            @XmlElement(name = "parameter", type = Parameter.class)
    })
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * @param parameters the parameters to set
     */
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}