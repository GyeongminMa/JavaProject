package com.yedam.java.bank;

public class Customer {
	String name;
	String bank;
	int account;
	int balance;
	
	
	public Customer(String name,String bank,int account, int balance) {
		this.name=name;
		this.bank=bank;
		this.account=account;
		this.balance=balance;	
		}
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("bank: " + bank);
		System.out.println("account: " + account);
		System.out.println("balance: " + balance);
	}
	void withDraw() {
		System.out.println("원금: " + balance);
		System.out.println("금리: " + (Bank.INTEREST_RATE*100) + "%");
		System.out.println("예상 금액: "+(balance +(balance*Bank.INTEREST_RATE))+"원 입니다." );
		
	}
}
