package com.company.lab5;

public class G extends F{
    protected String g = "G";

    public G(){

    }

    public G(String g){
        this.g = g;
    }

    public String toString(){
        return super.toString() + g;
    }
}
