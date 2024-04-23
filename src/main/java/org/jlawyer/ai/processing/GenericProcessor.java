/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.processing;

import org.jlawyer.ai.configuration.Backend;
import org.jlawyer.ai.model.AiRequestStatus;
import org.jlawyer.ai.model.AiResponse;

/**
 *
 * @author jens
 */
public class GenericProcessor implements RequestProcessor {
    
    private Backend backend=null;
    
    public GenericProcessor(Backend backend) {
        this.backend=backend;
    }

    @Override
    public boolean isAsync() {
        return backend.isAsync();
    }

    @Override
    public AiResponse processSync(String requestId) throws AiProcessorException {
        AiResponse response=new AiResponse();
        response.setExecutionMillis(1000);
        response.setModelType(backend.getModelType());
        response.setProgress(100f);
        response.setPrompt("");
        response.setRequestId(requestId);
        response.setRequestType(backend.getRequestType());
        response.setStatus("FINISHED");
        response.setStatusMessage("finished processing");
        return response;
    }

    @Override
    public void processAsync(String requestId) throws AiProcessorException {
        
    }

    @Override
    public AiRequestStatus getStatus(String requestId) throws AiProcessorException {
        return null;
    }

    @Override
    public AiResponse getResponse(String requestId) throws AiProcessorException {
        return null;
    }
    
}
