/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "processing")
public class Processing {
    
    
    private List<CommandlineProcessor> preProcessors;

    
    private List<CommandlineProcessor> processors;

    
    private List<CommandlineProcessor> postProcessors;

    // Getters and setters with XmlElement annotations

    /**
     * @return the preProcessors
     */
    @XmlElementWrapper(name = "pre-processors")
    @XmlElement(name = "commandline-processor")
    public List<CommandlineProcessor> getPreProcessors() {
        return preProcessors;
    }

    /**
     * @param preProcessors the preProcessors to set
     */
    public void setPreProcessors(List<CommandlineProcessor> preProcessors) {
        this.preProcessors = preProcessors;
    }

    /**
     * @return the processors
     */
    @XmlElementWrapper(name = "processors")
    @XmlElement(name = "commandline-processor")
    public List<CommandlineProcessor> getProcessors() {
        return processors;
    }

    /**
     * @param processors the processors to set
     */
    public void setProcessors(List<CommandlineProcessor> processors) {
        this.processors = processors;
    }

    /**
     * @return the postProcessors
     */
    @XmlElementWrapper(name = "post-processors")
    @XmlElement(name = "commandline-processor")
    public List<CommandlineProcessor> getPostProcessors() {
        return postProcessors;
    }

    /**
     * @param postProcessors the postProcessors to set
     */
    public void setPostProcessors(List<CommandlineProcessor> postProcessors) {
        this.postProcessors = postProcessors;
    }
}
