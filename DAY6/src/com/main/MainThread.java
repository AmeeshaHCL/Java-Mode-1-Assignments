package com.main;
import java.io.Serializable; 

import com.thread.ThreadNaming;

public class MainThread {

	public static void main(String[] args) {
		// creating two threads 
        ThreadNaming t1 = new ThreadNaming("test1"); 
        ThreadNaming t2 = new ThreadNaming("test2"); 
          
        // getting the above created threads names. 
        System.out.println("Thread 1: " + t1.getName()); 
        System.out.println("Thread 2: " + t2.getName()); 
         
        t1.start(); 
        t2.start(); 
    } 

	}


