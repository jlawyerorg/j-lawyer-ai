/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "processing")
public class Processing {
    
    
    private List<Processor> preProcessors;

    
    private List<Processor> processors;

    
    private List<Processor> postProcessors;

    // Getters and setters with XmlElement annotations

    /**
     * @return the preProcessors
     */
    @XmlElementWrapper(name = "pre-processors")
    @XmlElements({
            @XmlElement(name = "commandline-processor", type = CommandlineProcessor.class),
            @XmlElement(name = "deepl-processor", type = DeeplProcessor.class)
    })
    public List<Processor> getPreProcessors() {
        return preProcessors;
    }

    /**
     * @param preProcessors the preProcessors to set
     */
    public void setPreProcessors(List<Processor> preProcessors) {
        this.preProcessors = preProcessors;
    }

    /**
     * @return the processors
     */
    @XmlElementWrapper(name = "processors")
    @XmlElements({
            @XmlElement(name = "commandline-processor", type = CommandlineProcessor.class),
            @XmlElement(name = "deepl-processor", type = DeeplProcessor.class)
    })
    public List<Processor> getProcessors() {
        return processors;
    }

    /**
     * @param processors the processors to set
     */
    public void setProcessors(List<Processor> processors) {
        this.processors = processors;
    }

    /**
     * @return the postProcessors
     */
    @XmlElementWrapper(name = "post-processors")
    @XmlElements({
            @XmlElement(name = "commandline-processor", type = CommandlineProcessor.class),
            @XmlElement(name = "deepl-processor", type = DeeplProcessor.class)
    })
    public List<Processor> getPostProcessors() {
        return postProcessors;
    }

    /**
     * @param postProcessors the postProcessors to set
     */
    public void setPostProcessors(List<Processor> postProcessors) {
        this.postProcessors = postProcessors;
    }
}
