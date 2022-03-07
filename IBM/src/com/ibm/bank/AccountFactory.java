package com.ibm.bank;

public final class AccountFactory {

	private AccountFactory() {
	}
	
	public static Account openSavings(String holder) {
		return new Savings(holder);
	}
	
	public static Account openCurrent(String holder) {
		return new Current(holder);
	}
}
