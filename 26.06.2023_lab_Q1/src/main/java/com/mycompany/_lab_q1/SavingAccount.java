package com.mycompany._lab_q1;

public class SavingAccount extends BankAccount{
    
    private static final double SAVING_INTEREST_RATE = 0.12;
    
    @Override
    public void CalculateInterest()
    {
        double interest = getBalance()*SAVING_INTEREST_RATE;
        System.out.println("The interest for the savings account"+interest);
    }
}
