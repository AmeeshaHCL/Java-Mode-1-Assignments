package com.exercises;

public class Rectangle extends Shape //Child class , concept of inheritance
{
	private int length;
    private int breadth;

    Rectangle(String n, int l, int b) {
        super(n);
        name = n;
        length = l;
        breadth = b;
    }

     String getName()
    {
        return name;
    }
     int getLength()
    {
        return length;
    }
     int getBreadth()
    {
        return breadth;
    }
     
     void setName(String n)
     {
         this.name = n;
     }
     void setlength(int l) {
         this.length = l;
     }
     void setBreadth(int b) {
         this.breadth = b;
     }

    @Override
    float calculateArea() {
        float area;
        area  = (float) (length*breadth);
        return area;
    }



}
