package com.mycompany.question3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        
        try {
            File file = new File("C:\\Users\\Himan Gunawardana\\Desktop\\07.10.2023 Lab\\Question3\\nonexistent.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        }
    }
}
