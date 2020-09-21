package com.company.lab1;

public class basic {

    public static void main(String[] args){

        Screen ob1 = new Screen();

        ob1.color = "red";
        ob1.dimension = 4;
        ob1.resolution = 720;

        Screen ob2 = new Screen();

        ob2.color = "blue";
        ob2.dimension = 3;
        ob2.resolution = 1080;

        if (ob1.dimension > ob2.dimension) {
            System.out.println("The first monitor is bigger than the second one");
        }
        else if (ob1.dimension < ob2.dimension) {
            System.out.println("The second monitor is bigger than the first one");
        }
        else {
            System.out.println("The monitors have identical dimension");
        }

        if (ob1.resolution > ob2.resolution) {
            System.out.println("The first monitor has a better resolution than the second one");
        }
        else if (ob1.resolution < ob2.resolution){
            System.out.println("The second monitor has a better resolution than the first one");
        }
        else {
            System.out.println("The monitors have the same resolution");
        }
        if (ob1.color == ob2.color) {
            System.out.println("The monitors have the same color");
        }
        else{
            System.out.println("The monitors have different colours");
        }

    }
}
