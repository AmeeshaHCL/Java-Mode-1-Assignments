package com.exercises;
// the question to know the learning of inheritance
import java.util.Scanner;

public class Main // main class or driver class for all the super and base classes
{
	public static void main(String[]args)
	{
		String name;
        int rad,side,l,b;
        System.out.println("Circle\nSquare\nRectangle");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the shape name");
        name = s.nextLine();
        switch(name)
        {
            case "Circle":
              System.out.println("Enter the radius");
              rad = s.nextInt();
              Circle circle = new Circle(name, rad);
              System.out.printf("Area of Circle is %.2f ", circle.calculateArea());
              break;
            
            case "Square":
              System.out.println("Enter the side");
              side = s.nextInt();
              Square square = new Square(name, side);
              System.out.printf("Area of Square is %.2f ", square.calculateArea());
              break;

            case "Rectangle":
              System.out.println("Enter the length");
              l = s.nextInt();
              System.out.println("Enter the breadth");
              b = s.nextInt();
              Rectangle rectangle = new Rectangle(name, l, b);
              System.out.printf("Area of Rectangle is %.2f ", rectangle.calculateArea());
              break;
        }
        s.close();

	}
		
		
}


