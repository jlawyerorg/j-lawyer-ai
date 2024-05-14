/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.model;

import java.io.Serializable;

/**
 *
 * @author jens
 */
public class AiRequestStatus implements Serializable {
    
    private String requestId;
    private String status;
    private String statusDetails="";
    private AiResponse response=null;

    /**
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId the requestId to set
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the statusDetails
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * @param statusDetails the statusDetails to set
     */
    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * @return the response
     */
    public AiResponse getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(AiResponse response) {
        this.response = response;
    }
    
}
