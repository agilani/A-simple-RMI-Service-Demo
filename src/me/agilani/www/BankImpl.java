package me.agilani.www;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class BankImpl extends UnicastRemoteObject implements BankingService {

	private static final long serialVersionUID = 1L;

	private Map<String, Account> accounts = new HashMap<String, Account>();
	
	public BankImpl(Map<String, Account> accounts) throws RemoteException {
		this.accounts = accounts;
	}

	@Override
	public Account getAccount(String accountNo)
	{
		if(accounts.containsKey(accountNo))
		{
			return accounts.get(accountNo);
		}
		else
			return null;
	}

}
