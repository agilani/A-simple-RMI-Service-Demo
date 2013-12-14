package me.agilani.www;

import java.rmi.Naming;

public class BankOfficerClient {

	public static void main(String[] args) {
		try{
			BankingService bank = (BankingService) Naming.lookup("//localhost/BankServer");
			Account customerAccount = bank.getAccount("Adeel Account");
			if(customerAccount!=null)
			{
				System.out.println("\r\n \r\nAdeel Account");
				System.out.println("Adeel has " + customerAccount.getBalance() + "€");
				System.out.println("Crediting 10.20 in account");
				customerAccount.credit(10.20);
				System.out.println("Adeel has " + customerAccount.getBalance() + "€");
				System.out.println("Debiting 5.00 from account");
				customerAccount.debit(5.00);
				System.out.println("Adeel has " + customerAccount.getBalance() + "€");
				System.out.println("\r\n \r\nnow you see Adeel's Account Details.\r\nDonate... :-D");
			}
			else
			{
				System.out.println("Bank Account not found");
			}
				
		}
		catch (Exception e)
		{
			System.out.println("Error: looking up object in RMI registry." + e);
		}

	}

}
