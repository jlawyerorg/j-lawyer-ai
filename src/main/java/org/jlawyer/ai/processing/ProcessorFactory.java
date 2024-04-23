/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.processing;

import org.jlawyer.ai.configuration.Backend;
import org.jlawyer.ai.configuration.BackendConfiguration;

/**
 *
 * @author jens
 */
public class ProcessorFactory {
    
    public static RequestProcessor getProcessor(BackendConfiguration config, String requestType, String modelType) throws AiProcessorException {
        
        for(Backend b: config.getBackends()) {
            if(b.getRequestType().toLowerCase().equals(requestType.toLowerCase()) && b.getModelType().toLowerCase().equals(modelType.toLowerCase()))
                return new GenericProcessor(b);
        }
        
        throw new AiProcessorException("no backend configured for request type '" + requestType + "' and model type '" + modelType);
    }
    
}
