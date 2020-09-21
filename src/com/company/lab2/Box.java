package com.company.lab2;

public class Box {

    double height ;
    double width;
    double depth;


    Box() {
        height = 1;
        width = 1;
        depth = 1;
    }

    Box(double measure) {
        height = measure;
        width = measure;
        depth = measure;
    }

    Box(double height_, double width_, double depth_) {
        height = height_;
        width = width_;
        depth = depth_;
    }

    public double surface(){

        return 2*(depth * width + depth * height + height * width);
    }

    public double volume(){

        return depth * width * height;
    }
}
