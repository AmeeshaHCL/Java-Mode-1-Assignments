package com.thread;

public class DemoThread2 extends Thread{
	
	public DemoThread2(String name) 
    { 
        // call to constructor of  
        // the Thread class. 
        super(name); 
    }
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
