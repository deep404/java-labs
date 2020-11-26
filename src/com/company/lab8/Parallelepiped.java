package com.company.lab8;

public class Parallelepiped implements GeometricBody{
    private double width, lenght, height;

    public Parallelepiped(double lenght, double width, double height){
        System.out.println("Creating a Parallelepiped");
        this.lenght = lenght;
        this.width = width;
        this. height = height;
    }

    public double getSurface(){
        System.out.println("Calculating Surface of a Parallelepiped");
        return 2 * (lenght * width + lenght * height + width * height);
    }

    public double getVolume(){
        System.out.println("Calculating Volume of a Parallelepiped");
        return lenght * width * height;
    }

    public String getName()
    {
        return "Parallelepiped";
    }
}
