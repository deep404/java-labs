package com.company.lab8;

public class Cub implements GeometricBody{
    private double side;

    public Cub(double side){
        System.out.println("Creating a Cube");
        this.side = side;
    }

    public double getSurface()
    {
        System.out.println("Calculating Surface of a Cube");
        return 6 * side * side;
    }

    public double getVolume()
    {
        System.out.println("Calculating Volume of a Cube");
        return side * side * side;
    }

    public String getName()
    {
        return "Cube";
    }
}
