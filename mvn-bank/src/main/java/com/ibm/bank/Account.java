package com.ibm.bank;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		if(amount<0)
			throw new NumberFormatException("Negative amount");
		balance+= amount;
		return balance;
	}
	
	public double withdraw(double amount) throws BalanceException{	
		if(amount<0)
			throw new NumberFormatException("Negative amount");
		else if(amount>balance)
			throw new BalanceException("Insufficient balance");
		else {
			balance -= amount;
			return balance;
		}
	}
}
