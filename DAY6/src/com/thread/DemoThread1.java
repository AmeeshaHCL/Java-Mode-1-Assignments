package com.thread;


public class DemoThread1 implements Runnable{
	
	
	

	@Override
	public void run() {
		  
		for (int i = 0; i < 10; i++) 
        { 
            System.out.println("Running Child Thread in loop" + "  " + i); 
            try
            { 
                // thread to sleep for 1000 milliseconds 
                Thread.sleep(2000); 
            } 
  
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
		
		
		
		
		
	}
		
	    } 
		
	
		
	
		
	


