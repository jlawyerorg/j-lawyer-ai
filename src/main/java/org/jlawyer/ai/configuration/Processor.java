/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.configuration;

import java.io.File;
import java.util.HashMap;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.processing.AiProcessorException;

/**
 *
 * @author jens
 */
public abstract class Processor {
    
    public abstract void process(String requestId, Backend backend, AiRequest aiRequest, HashMap<String, File> inputFiles, HashMap<String, String> inputStrings) throws AiProcessorException;
    
}
