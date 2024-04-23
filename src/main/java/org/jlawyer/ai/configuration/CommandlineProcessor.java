/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "commandline-processor")
public class CommandlineProcessor {
    
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

}
