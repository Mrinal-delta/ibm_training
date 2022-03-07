package com.ibm.bank;

public class Current extends Account {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CURRENT_BAL);
		overdraft = OVERDRAFT_LIMIT;
		txns[idx ++] = new CurrentTransaction("OB", INIT_CURRENT_BAL, balance, OVERDRAFT_LIMIT);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft += amount;
		if(overdraft > OVERDRAFT_LIMIT) {
			balance += (overdraft - OVERDRAFT_LIMIT);
			overdraft = OVERDRAFT_LIMIT;
		}
		txns[idx ++] = new CurrentTransaction("Cr", amount, balance, overdraft);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if(amount <= (balance + overdraft)) {
			balance -= amount;
			if(balance < MIN_CURRENT_BAL) {
				overdraft += balance;
				balance = MIN_CURRENT_BAL;
			}
			txns[idx ++] = new CurrentTransaction("Dr", amount, balance, overdraft);
		} else
			throw new BalanceException("Insufficient balance!");
	}
}
