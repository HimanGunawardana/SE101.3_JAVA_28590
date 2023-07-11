package com.mycompany.question2;

public class Question2 {

    public static void main(String[] args) {
        
        int [] numbers = {5, 4, 3, 8, 7};
        
        try{
            int value = numbers[0]; // chane the numbers[x] ; x value
            System.out.println("Last element is: "+value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array is not of bound.");
        }
    }
}
