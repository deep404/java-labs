package com.company.lab7;

public class Main{

    public static void main(String args[]){
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(3,2);
        Triangle triangle = new Triangle(10,5,6);
        Figure objects[] = new Figure[3];
        objects[0] = square;
        objects[1] = rectangle;
        objects[2] = triangle;

        FigureController figures = new FigureController();
        System.out.println(figures.getBiggestAreaFigure(objects).getName());
        System.out.println(figures.getBiggestPerimeterFigure(objects).getName());

        //Java Anonnymous class with constructor argument
        Circle circle = new Circle(3){
            public double getArea()
            {
                System.out.println("Calculating Area of a Cricle");
                return Math.PI * radius * radius;
            }
            public double getPerimeter()
            {
                System.out.println("Calculating Perimeter of a Circle");
                return 2 * Math.PI * radius;
            }
            public String getName()
            {
                return "Circle";
            }
        };
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Figure objectsNew[] = new Figure[4];
        objectsNew[0] = square;
        objectsNew[1] = rectangle;
        objectsNew[2] = triangle;
        objectsNew[3] = circle;

        objects = objectsNew;

        System.out.println(figures.getBiggestAreaFigure(objects).getName());
        System.out.println(figures.getBiggestPerimeterFigure(objects).getName());


    }
}