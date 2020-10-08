package com.exercises;

public abstract class Shape // abstract class and super class for Circle, Square and Rectangle
{
	protected String name;

    Shape(String n){
        name = n;
    }

     String getName()
    {
        return name;
    }

     void setName(String n)
    {
        this.name = n;
    }

    abstract float calculateArea();
}




