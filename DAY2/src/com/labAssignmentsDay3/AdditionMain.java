package com.labAssignmentsDay3;

import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {
		int n ;
		int sum=0;
		Addition obj = new Addition();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers");
		n =sc.nextInt();
		
		
		System.out.println(obj.getSum(n));

	}

}
