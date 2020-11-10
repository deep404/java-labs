package com.company.lab7;

public class Square extends Figure{
    private double side_length;

    public Square(double side_length){
        System.out.println("Creating a Square");
        this.side_length = side_length;
    }

    public double getArea()
    {
        System.out.println("Calculating Area of a Square");
        return side_length*side_length;
    }

    public double getPerimeter()
    {
        System.out.println("Calculating Perimeter of a Square");
        return 4*side_length;
    }

    public String getName()
    {
        return "Square";
    }


}
