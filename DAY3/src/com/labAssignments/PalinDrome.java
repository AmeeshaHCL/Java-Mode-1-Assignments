//java program to print YES for Palindrome and NO for Not Palindrome
package com.labAssignments;

import java.util.Scanner;

public class PalinDrome {

	public static void main(String[] args) {
		String originalWord;
        String reverseWord="";
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        originalWord = sc.nextLine();
        for(int i=originalWord.length()-1;i>=0;i--)
        {
            ch = originalWord.charAt(i);
            reverseWord = reverseWord+ch;
        }
        if(originalWord.equals(reverseWord))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        sc.close();
   



	}

}
