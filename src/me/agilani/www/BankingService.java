package me.agilani.www;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankingService extends Remote {
	
	public Account getAccount(String accountNo) throws RemoteException;
}
