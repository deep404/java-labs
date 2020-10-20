package com.company.lab4;

public class Stack {
    private char arr[];
    private int top;
    private int capacity;

    //Initialize Stack
    Stack(int size)
    {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    //Function to add an element in the stack
    public void push(char x)
    {
        if(isFull())
        {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }
        //System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    //Function to pop top element from the stack
    public char pop()
    {
        if(isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        //System.out.println("Removing " + peek());
        return arr[top--];
    }

    //Function to return top element in a stack
    public char peek()
    {
        if(!isEmpty())
            return arr[top];
        else
            System.exit(1);
        return  ' ';
    }

    //Function to return the size of the stack
    public int size()
    {
        return top + 1;
    }

    //Function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;
    }

    //Function to check if the stack is full or not
    public Boolean isFull()
    {
        return top == capacity - 1;
    }
}
