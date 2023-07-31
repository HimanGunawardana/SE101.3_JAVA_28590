package com.mycompany.p04thirdq;
public class P04ThirdQ
{

    public static void main(String[] args)
    
    {
        char grade='A';
        if(grade=='A')
        {
            System.out.println("Excellent");
        }
        else if(grade=='B')
                {
                    System.out.println("You passed");
                }
                else if(grade=='F')
                {
                    System.out.println("Better try again");
                }
        else
                {
                    System.out.println("Invalid grade.");
                }
       
        System.out.println("Your grade is :"+grade);
    }
    
}
