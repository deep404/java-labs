package com.company.lab5;

public class H extends G{
    protected String h = "H";
    //protected X x = new X ("zzz");
    private X x = new X ("zzz");

    public H(){

    }

    public H(String h){
        this.h = h;
    }

    public String toString(){
        return super.toString() + h;
    }
}
