package com.ibm.bank;

/**
 * This class represents generalised bank account.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACNT_NO;
	
	protected Transaction[] txns;
	protected int idx;
	
	/** This is the default constructor. */
	public Account() {
	}

	/**
	 * Parameterised constructor
	 * @param holder
	 * @param balance
	 */
	public Account(String holder, double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new Transaction[10];
	}
	
	/** Method to display account summary. */
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// BL Methods
	public void deposit(double amount) {
		balance += amount;
		txns[idx ++] = new Transaction("Cr", amount, balance);
	}

	@Override
	public void statement() {
		System.out.println("Statement of A/C: " + acntNo);
		for(int i=0; i<idx; i++)
			System.out.println(txns[i].print());
	}
}
