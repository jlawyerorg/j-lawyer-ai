/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.util.ArrayList;
import java.util.List;
import org.jlawyer.ai.configuration.Backend;
import org.jlawyer.ai.configuration.BackendConfiguration;
import org.jlawyer.ai.model.AiCapability;
import org.jlawyer.ai.model.AiRequest;
import org.jlawyer.ai.model.AiRequestStatus;
import org.jlawyer.ai.model.AiResponse;
import org.jlawyer.ai.processing.AiProcessorException;
import org.jlawyer.ai.processing.ProcessorFactory;
import org.jlawyer.ai.processing.RequestProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author jens
 */
@RestController
@RequestMapping("/j-lawyer-ai")
@Tag(name = "j-lawyer.AI", description = "j-lawyer.AI endpoints")
public class AiRestEndpoint {
    
    private static final Logger log = LoggerFactory.getLogger(AiRestEndpoint.class);
    
    private final BackendConfiguration backendConfig;
    
    @Autowired
    public AiRestEndpoint(BackendConfiguration backendConfig) {
        this.backendConfig = backendConfig;
    }
    
    @GetMapping("/capabilities")
    @Operation(summary = "Get a list of supported AI requests", description = "Returns a list of capabilities and their metadata. Can be used by a calling client to populate menu items / buttons etc.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "404", description = "Resource not found")
    })
    public ResponseEntity<List<AiCapability>> getCapabilities() {

        List<AiCapability> capabilities=new ArrayList<>();
        for(Backend b: this.backendConfig.getBackends()) {
            AiCapability c=new AiCapability();
            c.setAsync(b.isAsync());
            c.setDefaultPrompt(b.getPrompt());
            c.setDescription(b.getDescription());
            c.setInput(b.getInput());
            c.setModelType(b.getModelType());
            c.setName(b.getName());
            c.setOutput(b.getOutput());
            c.setParameters(b.getParameters());
            c.setRequestType(b.getRequestType());
            capabilities.add(c);
        }
        
        return new ResponseEntity<>(capabilities, HttpStatus.OK);
    }
    
    @PostMapping("/request-submit")
    @Operation(summary = "Submits a request", description = "Returns a greeting message")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "404", description = "Resource not found")
    })
    public ResponseEntity<AiRequestStatus> submitRequest(@RequestBody AiRequest aiRequest) {
        
        try {
            String requestId="" + System.nanoTime();
            
            AiRequestStatus status=new AiRequestStatus();
            status.setRequestId(""+System.currentTimeMillis());
            
            RequestProcessor processor=ProcessorFactory.getProcessor(backendConfig, aiRequest.getRequestType(), aiRequest.getModelType());
            if(processor.isAsync()) {
                status.setStatus("EXECUTING");
            } else {
                AiResponse response=processor.processSync(requestId, aiRequest);
                status.setResponse(response);
                status.setStatus("FINISHED");
            }
            
            return new ResponseEntity<>(status, HttpStatus.OK);
        } catch (AiProcessorException ex) {
            log.error("error processing request", ex);
            
            AiRequestStatus status=new AiRequestStatus();
            status.setRequestId(""+System.currentTimeMillis());
            status.setStatus("ERROR");
            status.setStatusDetails(ex.getMessage());
            
            return new ResponseEntity<>(status, HttpStatus.INTERNAL_SERVER_ERROR);
            
        }
    }
    
    @GetMapping("/request-status/{requestId}")
    public ResponseEntity<AiResponse> getRequestStatus(@PathVariable String requestId) {
        AiResponse r=new AiResponse();
        r.setExecutionMillis(156);
        r.setRequestId(requestId);
        
        return new ResponseEntity<>(r, HttpStatus.OK);
    }
    
}
