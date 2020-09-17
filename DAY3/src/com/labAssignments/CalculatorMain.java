
// main class for the Calculator
package com.labAssignments;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		Calculator calculator =new Calculator();
		int num1= sc.nextInt();
		 int num2 = sc.nextInt();
		
		System.out.println(calculator.add(num1, num2));
		sc.close();

	}

}
