//program to modify the string
package com.labAssignments;

import java.util.Scanner;

public class ModifiedString {

	public static void main(String[] args) {
		String str;
        String s="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
        if (str.charAt(0) == 'k'){
           s += 'k';
        }
        if (str.charAt(1) == 'b'){
            s += 'b';
        }
        String ss = s + str.substring(2);
        System.out.println(ss);
        sc.close();


	}

}
