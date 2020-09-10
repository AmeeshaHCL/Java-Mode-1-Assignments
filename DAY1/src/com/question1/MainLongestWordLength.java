package com.question1;

import java.util.Scanner;

public class MainLongestWordLength {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two Strings");
		String str= sc.nextLine();
		int result= LongestWordLength.getLargestWord(str); 
		System.out.println(LongestWordLength.getLargestWord(str));
		

	}

}
