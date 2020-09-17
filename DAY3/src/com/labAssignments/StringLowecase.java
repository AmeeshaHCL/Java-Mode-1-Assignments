//Java program to convert all the characters in a string to lowercase.
package com.labAssignments;

import java.util.Scanner;

public class StringLowecase {

	public static void main(String[] args) {
		String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        str = sc.nextLine();
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90)
            {
                ch = (char)(ch + 32);
            }
            System.out.print(ch);
        }
        sc.close();
    

	}

}
