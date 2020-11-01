package com.company.lab5;

public class J extends I{
    protected String j = "J";

    public J(){

    }

    public J(String j){
        this.j = j;
    }

    public String toString(){
        return super.toString() + j;
    }
}
