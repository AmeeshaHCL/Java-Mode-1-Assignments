//Main class for customException (name and Age of Player)
package com.LabAssignmentsDay5;

import java.util.Scanner;

public class MainCustomException {
	public static void main(String[] args) {
        ExceptionMessage msg = new ExceptionMessage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name");
        String name = sc.nextLine();
        System.out.println("Enter the player age");
        int age = sc.nextInt();
        try{
            msg.ageCheck(name,age);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

}
