package br.ufrn.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServerInterface extends Remote {
    void registerClient(ClientInterface client) throws RemoteException;
    
    List<ClientInterface> containsWord(String word)throws RemoteException;
}