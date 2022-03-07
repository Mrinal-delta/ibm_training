package com.ibm.xe;

public class CurrencyConverter {
	
	public double convert(Currency source, Currency target, double amount) {
		return (target.dollarValue() / source.dollarValue()) * amount;
	}
}
