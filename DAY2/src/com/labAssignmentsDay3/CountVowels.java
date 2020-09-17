//count the vowels
package com.labAssignmentsDay3;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		String s;
        int c =0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.toLowerCase();
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                c++;
            }
        }
        System.out.println("Number of vowels in the string is: "+c);
        sc.close();

	}
}