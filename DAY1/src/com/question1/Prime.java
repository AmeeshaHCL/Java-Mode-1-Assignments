package com.question1;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num,counter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  The Number to be checked");
        num = sc.nextInt();
        for(int i =1; i<=num; i++)
        {
            if(num%i==0)
            {
                counter++;
            }
        }
        if(counter==2){
        System.out.println(num+" is prime");
        }
        else{
        System.out.println(num+" is not prime");
        }


	}

}
