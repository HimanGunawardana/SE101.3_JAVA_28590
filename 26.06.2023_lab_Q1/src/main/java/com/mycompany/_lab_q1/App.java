package com.mycompany._lab_q1;

public class App {

    public static void main(String[] args) {
        
        //saving
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.setBalance(10000);
        savingAccount.CalculateInterest();

        //checking
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setBalance(5000);
        checkingAccount.CalculateInterest();
    }
}
