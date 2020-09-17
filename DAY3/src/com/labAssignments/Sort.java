//Java program to sort an integer array of 10 elements in ascending.
package com.labAssignments;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		int temp;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < 10; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) { 
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i]; //sorting in sequential manner
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < 10; i++) 
        {
            System.out.print(arr[i] + ", ");// printing the array in ascending order
        }
        sc.close();
    }

}


