//to print whether the string is panagram or not
package com.labAssignments;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		String str;
        boolean[] alphaList = new boolean[26];
        int index = 0;
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str = sc.nextLine();
      for (int i = 0; i < str.length(); i++) {
         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
         {
            index = str.charAt(i) - 'A';
         }
         else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
         {
            index = str.charAt(i) - 'a';
      }
      alphaList[index] = true;
   }
   for (int i = 0; i <= 25; i++) 
   {
      if (alphaList[i] == false)
      flag = 0;
   }
   if (flag == 1)
   {
      System.out.println("Pangram");
   }
   else
   {
      System.out.println("Not a Pangram");
   }
        sc.close();

	}

}
