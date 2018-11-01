package entities;

import java.util.Scanner;

public class BankServices {
	private int accountNumber;
	private String accountName;
	private double accountValor;
	
	// constructor
	public BankServices(int accountNumber, String accountName, double accountValor) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountValor = accountValor;
	}
	
	// getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountValor() {
		return accountValor;
	}

	public void setAccountValor(double accountValor) {
		this.accountValor = accountValor;
	}
	
	

	//private 
}
