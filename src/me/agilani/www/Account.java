package me.agilani.www;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private double balance = 0.00;
	
	
	
	public Account()
	{
		super();
	}
	
	
	public void credit(double amount)
	{
		this.setBalance(this.getBalance() + amount);
	}
	
	public void debit(double amount)
	{
		this.setBalance(this.getBalance() - amount);
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
