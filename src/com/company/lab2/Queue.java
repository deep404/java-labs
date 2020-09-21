package com.company.lab2;

public class Queue {
    int arr[];    // array to store the queue elements
    int front;    // front points to front element in the queue
    int last;      // end points to last element in the queue;
    int capacity; // maximum capacity of the queue;
    int count;    // current capacity of the queue;
    boolean unlimited;

    //Constructor to initialize queue
    Queue(){
        arr = new int[10000007];
        capacity = 10000007;
        front = 0;
        last = -1;
        count = 0;
        unlimited = true;
    }


    //Constructor to initialize queue
    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        last = -1;
        count = 0;
        unlimited = false;
    }

    //Function to remove front element from the queue
    public void pop(){

        if(isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + arr[front]);

        front = (front + 1) % capacity;
        count--;
    }

    //Function to add an item to the queue
    public void push(int item){

        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting "+ item);

        last = (last + 1) % capacity;
        arr[last] = item;
        count++;
    }

    //Function to return the front element in the queue
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    //Function to check the size of the queue
    public int size(){

        return count;
    }

    //Function to check is the queue is empty or not
    public Boolean isEmpty(){

        return(size() == 0);
    }

    //Function to check if the queue is full or not
    public Boolean isFull(){

        return(size() == capacity);
    }

    public void IsFull() {

        if (size() == capacity && !unlimited) {
            System.out.println("Queue is full");
        }
        else if(size() != capacity && !unlimited) {
            System.out.println("Queue is not full");
        }
        if (unlimited) {
            System.out.println("Queue is never full");
        }
    }
    public void IsEmpty(){

        if(size() == 0){
            System.out.println("Queue is empty");
        }else {
            System.out.println("Queue is not empty");
        }

    }


}
