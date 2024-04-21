/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.processing;

import org.jlawyer.ai.processing.deepl.DeeplProcessor;

/**
 *
 * @author jens
 */
public class ProcessorFactory {
    
    public static RequestProcessor getProcessor(String requestType, String modelType) {
        if("deepl".equalsIgnoreCase(modelType))
            return new DeeplProcessor();
        
        return null;
    }
    
}
