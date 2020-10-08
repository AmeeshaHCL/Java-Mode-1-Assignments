package com.thread;

public class ThreadNaming extends Thread
{
	public ThreadNaming(String name) 
    { 
        // call to constructor of  
        // the Thread class. 
        super(name); 
        try {
			sleep(10);// Sleep for 10 seconds
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    } 
  
    @Override
    public void run() 
    { 
    	
        System.out.println("Thread is running....."); 
    } 

}
// 2 In the previous program remove the try{}catch(){} block surrounding the sleep method and try to execute the code. What is your observation? 
//Ans: Error