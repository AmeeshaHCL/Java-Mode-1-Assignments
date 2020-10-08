package com.main;

import com.thread.DemoThread1;

public class MainThread1 {

	public static void main(String[] args) {
		
		Runnable runnable = new DemoThread1();
		Thread t = new Thread(new DemoThread1()); 
		  
        // call run() function 
        t.start(); 
  
        Thread t2 = new Thread(new DemoThread1()); 
  
        // call run() function 
        t2.start(); 

	}

}
