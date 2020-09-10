package com.question1;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		int number1,number2,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Both the Numbers to be swapped");
        
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        System.out.println("Before Swap: "+number1+" "+number2);
        temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("After Swap: "+number1+" "+number2);

	}

}
