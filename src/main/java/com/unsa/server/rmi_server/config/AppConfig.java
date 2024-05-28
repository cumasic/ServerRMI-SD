package com.unsa.server.rmi_server.config;

import com.unsa.server.rmi_server.service.CalculatorService;
import com.unsa.server.rmi_server.service.CalculatorServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@Configuration
public class AppConfig {

    @Bean
    public Registry registry() throws RemoteException {
        return LocateRegistry.createRegistry(1099);
    }

    @Bean
    public RmiServiceExporter rmiServiceExporter() throws Exception {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("CalculatorServices");
        exporter.setServiceInterface(CalculatorService.class);
        exporter.setService(new CalculatorServiceImpl());
        exporter.setRegistryPort(1099);
        return exporter;
    }
}