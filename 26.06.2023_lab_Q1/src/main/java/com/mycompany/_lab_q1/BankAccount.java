package com.mycompany._lab_q1;

public abstract class BankAccount {
    
    private String accountNumber;
    private double balance;
    
    public void setAccountNumber(String acc)
    {
        this.accountNumber=acc;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    
    public abstract void CalculateInterest();
}
