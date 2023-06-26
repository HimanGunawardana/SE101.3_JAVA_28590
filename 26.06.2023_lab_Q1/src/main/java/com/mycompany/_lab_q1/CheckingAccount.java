package com.mycompany._lab_q1;

public class CheckingAccount extends BankAccount{
    
    private static final double CHECKING_INTEREST_RATE = 0.02;
    

    @Override
    public void CalculateInterest()
    {
        double interest = getBalance()*CHECKING_INTEREST_RATE;
        System.out.println("The interest for the savings account"+interest);
    }
    
}
