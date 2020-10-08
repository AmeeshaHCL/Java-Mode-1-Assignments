//main or driver program for the understang of concepts of Interface in order to claculate the sum of divisor using AdvanceAritmetic Interface
package com.exercises;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
      	AdvanceArithmetic calculator=new MyCalculator(); 
        System.out.println("I implemented: AdvancedArithmetic\n"+ calculator.divisor_sum(n));
        sc.close();

	}

}
