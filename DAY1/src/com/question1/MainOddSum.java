//Program to print the sum of odd digits MAIN FUNCTION/ DRIVER PROGRAM
package com.question1;

import java.util.Scanner;

public class MainOddSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int result=SumOfOddDigits.checkodd(number);
		if(result==1)
		{
			System.out.println("Sum of odd digits is odd.");
		}
		else
		{
			System.out.println("Sum of odd digits is even");
		}

	}

}
