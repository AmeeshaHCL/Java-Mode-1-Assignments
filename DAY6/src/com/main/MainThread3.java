package com.main;
import java.io.*;
import java.util.Scanner;


import com.thread.Number;

public class MainThread3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		Runnable runnable = new Number();
		Thread t = new Thread(new Number());
        t.start();
        Runnable runnable2 = new Number();
		Thread t1 = new Thread(new Number());
        t1.start();
        Runnable runnable3 = new Number();
		Thread t2 = new Thread(new Number());
        t2.start();
        System.out.println("Multiples of numbers");

	}

}
