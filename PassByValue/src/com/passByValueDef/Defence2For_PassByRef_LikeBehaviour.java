package com.passByValueDef;

//To avoid direct modification of your original object:
//2.Use the principal of Encapsulation.

class BankAccount {
	private Double balance;
	
	public Double getBalance() {
		return this.balance;
	}
	
	public BankAccount(Double balance) {
		this.balance = balance;
	}
}

public class Defence2For_PassByRef_LikeBehaviour {
	private void depositeMoney(BankAccount bnkAcc, Double depositeAmount) {
//		bnkAcc.balance = bnkAcc.balance + depositeAmount;	//Compiler/Checked error, cannot access private property.
//		bnkAcc.setBalance(bnkAcc.getBalance()+depositeAmount);	//Compiler/Checked error, setter method is not provided.
		
		//Safe modification
		bnkAcc = new BankAccount(bnkAcc.getBalance() + depositeAmount);
	}
	
	public static void main(String[] args) {
		BankAccount bnkAcc = new BankAccount(5000d);
		System.out.println("Initial Balance: " + bnkAcc.getBalance());
		new Defence2For_PassByRef_LikeBehaviour().depositeMoney(bnkAcc, 1000d);
		System.out.println("Final Balance: " + bnkAcc.getBalance());
	}
}
