package com.question1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int num1,num2,num3;
        double average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        average = (num1+num2+num3)/3.0;
        System.out.println(average);
    

	}

}
