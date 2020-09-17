//Exception HAndling
package com.LabAssignmentsDay5;

import java.util.Scanner;

public class ExceptionHandling {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Value of the numbers to check Which Exception is caught");
	        try{
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            System.out.println(a/b);
	        }
	        catch(Exception e){
	            System.out.println(e);
	        }
	        sc.close();
	    }
	}



