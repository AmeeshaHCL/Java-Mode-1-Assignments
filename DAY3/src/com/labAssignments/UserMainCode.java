package com.labAssignments;

import java.util.Scanner;

public class UserMainCode {
	static String reshape()
    {
        String str, s="";
        char ch,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        System.out.println("Enter character");
        ch = sc.next().charAt(0);
        for(int i=str.length()-1;i>=0;i--)
        {
            c = str.charAt(i);
            s = s+c+ch;
        }
        sc.close();
        s = s.substring(0, s.length() - 1);
        return s;
    }

}
