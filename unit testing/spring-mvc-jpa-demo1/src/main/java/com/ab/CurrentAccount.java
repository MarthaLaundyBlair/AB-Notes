package com.ab;

public class CurrentAccount extends BankAccount {
	
	private double overdraft;
	
	public CurrentAccount(int bankAccountId, String bankAccountTitle, double bankBalance, double overdraft) {
		super(bankAccountId, bankAccountTitle, bankBalance);
		this.overdraft  = overdraft;
	}

	@Override
	public void withdraw(double withdraw) {
		
		if(super.getBankBalance() >= withdraw) {
			super.setBankBalance(super.getBankBalance() - withdraw );
		}
	
	}

}
