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

/**
 *
 * @author jens
 */
@RestController
@RequestMapping("/j-lawyer-ai")
@Tag(name = "j-lawyer.AI", description = "j-lawyer.AI endpoints")
public class AiRestEndpoint {
    
    @GetMapping("/hello")
    @Operation(summary = "Get greeting message", description = "Returns a greeting message")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "404", description = "Resource not found")
    })
    public String hello() {
        return "Hello, world!";
    }
    
}
