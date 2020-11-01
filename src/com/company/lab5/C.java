package com.company.lab5;

public class C extends B {
    protected String c = "C";

    public C(){

    }

    public C(String c){
        this.c = c;
    }

    public String toString(){
        return super.toString() + c;
    }
}
