package com.mycompany.shapep05;

public class Circle extends ShapeP05
{
    private double radius;
    
    public Circle(int r)
    {
        this.radius=r;
    }
    
    public void calculateArea()
    {
        area=radius*radius*pi;
    }
    
    
}
