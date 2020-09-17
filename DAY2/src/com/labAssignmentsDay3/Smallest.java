
//java program to print the smallest number
package com.labAssignmentsDay3;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to print the smallest amongst them");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a<b && a<c)
        {
            System.out.println(a+" is smallest");
        }
        else if(b<c && b<a)
        {
            System.out.println(b+" is smallest");
        }
        else
        {
            System.out.println(c+" is smallest");
        }
        sc.close();


	}

}
