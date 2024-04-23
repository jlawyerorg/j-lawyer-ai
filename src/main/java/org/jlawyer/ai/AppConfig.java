/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jlawyer.ai;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.ValidationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.File;
import org.jlawyer.ai.configuration.BackendConfiguration;

@Configuration
public class AppConfig {

    @Bean
    public BackendConfiguration backendConfig() throws JAXBException {
        File file = new File("j-lawyer-ai.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(BackendConfiguration.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        jaxbUnmarshaller.setEventHandler((ValidationEvent ve) -> {
            System.err.println("Validation Error: " + ve.getMessage());
            // Return false to continue unmarshalling despite validation errors
            return false;
        });

        return (BackendConfiguration) jaxbUnmarshaller.unmarshal(file);
    }
}
