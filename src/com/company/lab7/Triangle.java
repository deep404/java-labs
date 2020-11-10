package com.company.lab7;
import java.lang.*;

public class Triangle extends Figure{
    private double first_side, second_side, third_side;

    public Triangle(double first_side, double second_side, double third_side){
        System.out.println("Creating a Triangle");
        this.first_side = first_side;
        this.second_side = second_side;
        this.third_side = third_side;
    }

    public double getArea()
    {
        System.out.println("Calculating Area of a Triangle");
        return Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - first_side) * (getPerimeter()/2 - second_side) * (getPerimeter()/2 - third_side));
    }

    public double getPerimeter()
    {
        System.out.println("Calculating Perimeter of a Triangle");
        return first_side + second_side + third_side;
    }

    public String getName()
    {
        return "Triangle";
    }
}