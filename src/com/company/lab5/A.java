package com.company.lab5;

public class A {
    protected String a = "A";
    protected X x = new X("xxx");
    public A(){

    }
    public A(String a, X x){
        this.a = a;
        this.x = x;
    }
    public String toString() {
        return a + x.getX();
    }
}