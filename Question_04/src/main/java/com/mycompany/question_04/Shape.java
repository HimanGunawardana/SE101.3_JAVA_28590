package com.mycompany.question_04;

abstract class Shape extends calculateArea{
    
    protected double area;

    public abstract void calculateArea();

    public void display() {
        System.out.println("Area: " + area);
    }
    
}
