package com.question1;
import java.util.Scanner;

public class AsciiNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Character");
		char character1 = sc.next().charAt(0);  
		char character2 = sc.next().charAt(0); 
	 
		int asciinumber1 = character1;  
		int asciinumber2 = character2;  
		System.out.println("The ASCII number of " + character1 + " is: " + asciinumber1);  
		System.out.println("The ASCII number of " + character2 + " is: " + asciinumber2);  
		}  
		  


	}


