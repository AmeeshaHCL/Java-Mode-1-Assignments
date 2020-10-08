package com.exercises;

public class Circle  extends Shape//Child class , concept of inheritance
{
	private int radius;

    Circle(String n, int r) {
        super(n);
        name = n;
        radius = r;
    }

     String getName()
    {
        return name;
    }
     int getRadius()
    {
        return radius;
    }
     
     void setName(String n)
     {
         this.name = n;
     }
     void setRadius(int r) {
         this.radius = r;
     }

    @Override
    float calculateArea() {
        float area;
        area  = (float) (3.14 * radius * radius);
        return area;
    }



}
