package com.company.lab5;

public class E extends D{
    protected String e = "E";

    public E(){

    }

    public E(String e){
        this.e = e;
    }

    public String toString(){
        return super.toString() + e;
    }
}
