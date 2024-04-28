/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "prompt")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prompt {
    
    @XmlAttribute(name = "default-prompt")
    private String defaultPrompt;
    
    @XmlAttribute(name = "max-tokens")
    private long maxTokens=Long.MAX_VALUE;

    // Getters and setters with XmlElement annotations

    /**
     * @return the defaultPrompt
     */
    public String getDefaultPrompt() {
        return defaultPrompt;
    }

    /**
     * @param defaultPrompt the defaultPrompt to set
     */
    public void setDefaultPrompt(String defaultPrompt) {
        this.defaultPrompt = defaultPrompt;
    }

  
    public static int countTokens(String text) {
        // Split the text into words using whitespace as the delimiter
        String[] words = text.split("\\s+");
        // Return the number of words
        return words.length;
    }

    /**
     * @return the maxTokens
     */
    public long getMaxTokens() {
        return maxTokens;
    }

    /**
     * @param maxTokens the maxTokens to set
     */
    public void setMaxTokens(long maxTokens) {
        this.maxTokens = maxTokens;
    }
    


}
