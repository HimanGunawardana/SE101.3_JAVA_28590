package com.mycompany.shapep05;

public class Rectangle extends ShapeP05
{
    private double length, width;
    
    public Rectangle(double l, double w)
    {
        this.width=w;
        this.length=l;
    }
    
    public void calculateArea()
    {
        area=length*width;     
    }
}
