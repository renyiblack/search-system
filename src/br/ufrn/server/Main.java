package br.ufrn.server;

import br.ufrn.interfaces.ServerInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        
        ServerInterface server = new Server();
        
        LocateRegistry.createRegistry(1098);
        
        Naming.rebind("rmi://127.0.0.1:1098/server", server);
        
        System.out.println("RMI Callback Server Started.");
        
    }
    
}