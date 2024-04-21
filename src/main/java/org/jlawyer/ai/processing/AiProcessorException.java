/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package org.jlawyer.ai.processing;

/**
 *
 * @author jens
 */
public class AiProcessorException extends Exception {

    /**
     * Creates a new instance of <code>AiProcessorException</code> without
     * detail message.
     */
    public AiProcessorException() {
    }

    /**
     * Constructs an instance of <code>AiProcessorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AiProcessorException(String msg) {
        super(msg);
    }
}
