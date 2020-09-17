//Java program to search for an element of an integer array of 10 elements
package com.labAssignments;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int arr[] = new int[10];
        int i,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for (i = 0; i < 10; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        k = sc.nextInt();
        for(i=0;i<10;i++)
        {    
            if(arr[i] == k){
                System.out.println(k+" is found at position "+i); 
                break;
            } 
        }
        if(i==10){
            System.out.println("Element not found in array");
        }
        sc.close();
    }
}


