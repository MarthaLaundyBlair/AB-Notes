package com.ab;

abstract public class BankAccount {
	
	private int bankAccountId;
	
	private String bankAccountTitle;
	
	private double bankBalance;

	public BankAccount(int bankAccountId, String bankAccountTitle, double bankBalance) {
		super();
		this.bankAccountId = bankAccountId;
		this.bankAccountTitle = bankAccountTitle;
		this.bankBalance = bankBalance;
	}

	public int getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getBankAccountTitle() {
		return bankAccountTitle;
	}

	public void setBankAccountTitle(String bankAccountTitle) {
		this.bankAccountTitle = bankAccountTitle;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance = bankBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountId=" + bankAccountId + ", bankAccountTitle=" + bankAccountTitle
				+ ", bankBalance=" + bankBalance + "]";
	}
	
	
	public abstract void withdraw(double withdraw);
	
	
	
	
	

}
