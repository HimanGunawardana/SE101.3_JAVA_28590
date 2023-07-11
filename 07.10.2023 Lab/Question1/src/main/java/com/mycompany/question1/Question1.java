package com.mycompany.question1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        int no1,no2,ans;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numerator: ");
        no1=sc.nextInt();
        System.out.println("Enter the denominator: ");
        no2=sc.nextInt();
        try{
            ans=no1/no2;
            System.out.println("Result: "+ans);
        }
        catch(ArithmeticException e){
            System.out.println("The denominator is zero");
        }
    }
}
