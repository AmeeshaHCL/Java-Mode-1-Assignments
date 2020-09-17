// Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string. 
package com.labAssignments;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be replaced");
        str = sc.nextLine();
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'd')
            {
                ch = 'h';
            }
            System.out.print(ch);
        }
        sc.close();

	}

}
