//java program to display the middle character
package com.labAssignmentsDay3;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.nextLine();
        int l = s.length();
        int mid = l/2;
            if(l%2!=0) //odd
            {
                char c = s.charAt(mid);
                System.out.println("The middle character of the string is: "+c);
            }
            else if(l%2==0)//even
            {
                char c = s.charAt(mid);
                char ch = s.charAt(mid-1);
                System.out.println("The middle character of the string is: "+ch+""+c);
            }
        sc.close();


	}

}
