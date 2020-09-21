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

    Box(double x) {
        height = x;
        width = x;
        depth = x;
    }

    Box(double x, double y, double z) {
        height = x;
        width = y;
        depth = z;
    }
}
