package me.agilani.www;

import java.rmi.Naming;
import java.util.HashMap;
import java.util.Map;

public class BankServer {
	public static void main(String[] args)
	{
		Map<String, Account> allAccounts = new HashMap<String, Account>();
		
		allAccounts.put("Badr Account", new Account());
		allAccounts.put("Cheng Account", new Account());
		allAccounts.put("Faisal Account", new Account());
		allAccounts.put("Kieran Account", new Account());
		allAccounts.put("Shoaib Account", new Account());
		allAccounts.put("Adeel Account", new Account());
		
		try{
			Naming.rebind("BankServer", new BankImpl(allAccounts));
			System.out.println("The Bank server is ready...");
		}
		catch(Exception e)
		{
			System.out.println("Error creating Bank object.");
		}
	}

}
