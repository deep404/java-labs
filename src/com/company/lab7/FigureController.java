package com.company.lab7;
import java.util.*;

public class FigureController {
    public Figure getBiggestAreaFigure(Figure objects[]) {
      int n,i,biggestIndex = 0;
      double biggestArea = 0;
      n = objects.length;
      for(i = 0; i < n; i++)
      {
          if (objects[i].getArea() > biggestArea)
          {
              biggestArea = objects[i].getArea();
              biggestIndex = i;
          }
      }
      return objects[biggestIndex];

    }

    public Figure getBiggestPerimeterFigure(Figure objects[])
    {
        int n,i,biggestIndex = 0;
        double biggestPerimeter = 0;
        n = objects.length;
        for(i = 0; i < n; i++)
        {
            if (objects[i].getPerimeter() > biggestPerimeter)
            {
                biggestPerimeter = objects[i].getPerimeter();
                biggestIndex = i;
            }
        }
        return objects[biggestIndex];
    }
}
