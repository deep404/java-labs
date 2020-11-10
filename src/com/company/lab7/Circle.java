package com.company.lab7;

public class Circle extends Figure{
    protected double radius;

    public Circle(double radius)
    {
        System.out.println("Creating a Circle");
        this.radius = radius;
    }
    public double getArea()
    {
        return 0;
    }
    public double getPerimeter()
    {
        return 0;
    }

    public String getName()
    {
        return "";
    }

}
