package com.company.lab5;

public class F extends E{
    protected String f = "F";

    public F(){

    }

    public F(String f){
        this.f = f;
    }

    public String toString(){
        return super.toString() + f;
    }
}
