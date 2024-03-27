package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    
    public Account(String s1) {
    	accountNo=s1;
    }
    public void setBalance(int theBalance) {
    	balance=theBalance;
    }
    public int getBalance() {
    	return balance;
    }
    public void deposit(int money) {
    	balance+=money;
    }
    public void withdraw(int money) {
    	balance=balance-money;
    }
    public void showBalance() {
    	System.out.println(getBalance());
    }

    
    
    
    //필요한 메소드 작성

}
