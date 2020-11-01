package com.company.lab5;

public class D extends C{
    protected String d = "D";
    protected X x = new X("yyy");

    public D(){

    }

    public D(String d){
        this.d = d;
    }

    public String toString(){
        return super.toString() + d;
    }
}
