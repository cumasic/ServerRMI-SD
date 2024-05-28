package com.unsa.server.rmi_server.service;

import java.rmi.Remote;
import java.rmi.RemoteException; 

public interface CalculatorService  {
    public int add(int a, int b) throws RemoteException; 
    public int subtract(int a, int b) throws RemoteException; 
}
