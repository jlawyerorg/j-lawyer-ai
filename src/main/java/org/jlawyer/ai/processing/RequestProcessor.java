/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.processing;

import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.model.AiRequestStatus;
import org.jlawyer.ai.model.AiResponse;

/**
 *
 * @author jens
 */
public interface RequestProcessor {
    
    public boolean isAsync();
    
    public AiResponse processSync(String requestId, AiRequest aiRequest) throws AiProcessorException;
    public void processAsync(String requestId, AiRequest aiRequest) throws AiProcessorException;
    public AiRequestStatus getStatus(String requestId) throws AiProcessorException;
    public AiResponse getResponse(String requestId) throws AiProcessorException;
    
}
