//print the substring consisting of all characters inclusive range from the index number
package com.labAssignments;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		String s;
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s = sc.nextLine();
        System.out.println("Enter start range");
        a = sc.nextInt();
        System.out.println("Enter end range");
        b = sc.nextInt();
        for(int i=a; i<b; i++)
        {
            System.out.print(s.charAt(i));
        }
        sc.close();

	}

}
