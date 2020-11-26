package com.company.lab8;

public class Main {
    public static void main(String args[])
    {
        Cub cube = new Cub(3);
        Sphere sphere = new Sphere(2.5);
        Parallelepiped parallelepiped = new Parallelepiped(3, 5, 4);
        GeometricBody objects[] = new GeometricBody[3];
        objects[0] = cube;
        objects[1] = sphere;
        objects[2] = parallelepiped;

        GeometricBodyController bodies = new GeometricBodyController();
        System.out.println("Body with the biggest volume is " + bodies.getBiggestVolumeBody(objects).getName());
        System.out.println("Body with the biggest surface is " + bodies.getBiggestSurfaceBody(objects).getName());
    }
}
