package com.question1;

import java.util.Scanner;

public class MainUserMainCode {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int result= UserMainCode.sumOfSquareOfEvenDigits(number);
		System.out.println(UserMainCode.sumOfSquareOfEvenDigits(number));

	}

	}


