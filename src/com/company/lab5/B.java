package com.company.lab5;

public class B extends A{
    protected String b = "B";

    public B(){

    }

    public B(String b){
        this.b = b;
    }

    public String toString(){
        return super.toString() + b;
    }
}
