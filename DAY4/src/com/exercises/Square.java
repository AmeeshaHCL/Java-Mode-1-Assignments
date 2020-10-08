package com.exercises;

public class Square extends Shape //Child class , concept of inheritance
{
	private int side;

    Square(String n, int s) {
        super(n);
        name = n;
        side = s;
    }

     String getName()
    {
        return name;
    }
     int getSide()
    {
        return side;
    }
     
     void setName(String n)
     {
         this.name = n;
     }
     void setSide(int s) {
         this.side = s;
     }

    @Override
    float calculateArea() {
        float area;
        area  = (float) (side*side);
        return area;
    }



}
