package com.company.lab7;

public class Rectangle extends Figure{
    private double length, width;

    public Rectangle(double length, double width){
        System.out.println("Creating a Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        System.out.println("Calculating Area of a Rectangle");
        return width*length;
    }

    public double getPerimeter()
    {
        System.out.println("Calculating Perimeter of a Rectangle");
        return 2*(width + length);
    }

    public String getName()
    {
        return "Rectangle";
    }
}