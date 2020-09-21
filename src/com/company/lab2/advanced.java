package com.company.lab2;

public class advanced {

    public static void main(String[] args)
    {
        //Box manipulation
        Box obj1 = new Box();
        obj1.depth = 9;
        obj1.width = 3;
        obj1.height = 7;

        Box obj2 = new Box(4);

        Box obj3 = new Box(3,5,6);

        System.out.println("Surface of object 1 is " + obj1.surface() + " Volume of object 1 is " + obj1.volume());
        System.out.println("Surface of object 2 is " + obj2.surface() + " Volume of object 2 is " + obj2.volume());
        System.out.println("Surface of object 3 is " + obj3.surface() + " Volume of object 3 is " + obj3.volume());


        //Queue manipulation
        Queue q1 = new Queue(4);
        Queue q2 = new Queue();

        q1.IsEmpty();
        q2.IsEmpty();

        q1.push(5);

        q1.IsEmpty();

        q1.push(4);
        q1.push(9);
        q1.push(7);

        q1.IsFull();

        q2.push(10);

        q2.IsFull();


    }
}
