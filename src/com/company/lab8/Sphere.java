package com.company.lab8;

public class Sphere implements GeometricBody{
    private double radius;

    public Sphere(double radius){
        System.out.println("Creating a Sphere");
        this.radius = radius;
    }

    public double getSurface(){
        System.out.println("Calculating Surface of a Sphere");
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume(){
        System.out.println("Calculating Volume of a Sphere");
        return 4.0/3 * Math.PI * radius * radius * radius;
    }

    public String getName()
    {
        return "Sphere";
    }
}
