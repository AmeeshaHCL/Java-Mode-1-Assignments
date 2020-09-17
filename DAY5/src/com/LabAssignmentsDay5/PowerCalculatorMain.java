//The main Function to calculate the power 
package com.LabAssignmentsDay5;

import java.util.Scanner;

public class PowerCalculatorMain {

	public static void main(String[] args) {
		PowerCalculator calculator = new PowerCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers");
        int n = sc.nextInt();
        int p = sc.nextInt();
        try {
            System.out.println(calculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

}


