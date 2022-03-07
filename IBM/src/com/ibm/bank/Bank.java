package com.ibm.bank;

public interface Bank {
	// Application constants
	int INIT_ACNT_NO = 101001;
	double MIN_SAVINGS_BAL = 1000;
	double INIT_CURRENT_BAL = 5000;
	double MIN_CURRENT_BAL = 0;
	double OVERDRAFT_LIMIT = 10000;
	
	// Application interface
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	void summary();
	void statement();
}
