package com.company.lab2;

public class intermediate {

    public static void main(String[] args) {

        //create a queue of capacity 5
        Queue q1 = new Queue(5);
        Queue q2 = new Queue();

        q1.push(1);
        q1.push(2);
        q1.push(3);

        q2.push(5);
        q2.push(6);
        q2.push(7);


        System.out.println("Front element in first queue is: " + q1.peek());
        System.out.println("Front element in second queue is: " + q2.peek());

//        q1.pop();
//        System.out.println("Front element is: " + q1.peek());
//
//        System.out.println("Queue size is " + q.size());
//
//        q1.pop();
//        q1.pop();
//
//        if(q1.isEmpty())
//            System.out.println("Queue Is Empty");
//        else
//            System.out.println("Queue Is Not Empty");

    }
}
