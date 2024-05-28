package com.unsa.server.rmi_server.config;

import com.unsa.server.rmi_server.service.CalculatorService;
import com.unsa.server.rmi_server.service.CalculatorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;


@Configuration
public class AppConfig {
    @Bean
    public RmiServiceExporter rmiServiceExporter() throws Exception {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("CalculatorServices");
        exporter.setServiceInterface(CalculatorService.class);
        exporter.setService(new CalculatorServiceImpl());
        return exporter;
    }
}