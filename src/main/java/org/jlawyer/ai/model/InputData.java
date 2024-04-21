/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai.model;

/**
 *
 * @author jens
 */
public class InputData {
    private String type;
    private String data;
    private String fileName;
    private boolean base64Encoded;

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the base64Encoded
     */
    public boolean isBase64Encoded() {
        return base64Encoded;
    }

    /**
     * @param base64Encoded the base64Encoded to set
     */
    public void setBase64Encoded(boolean base64Encoded) {
        this.base64Encoded = base64Encoded;
    }
}
