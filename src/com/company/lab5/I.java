package com.company.lab5;

public class I extends H{
    protected String i = "I";

    public I(){

    }

    public I(String i){
        this.i = i;
    }

    public String toString(){
        return super.toString() + i;
    }
}
