package com.main;

import com.thread.DemoThread2;


public class MainThread2 {

	public static void main(String[] args) {
		DemoThread2 t1 = new DemoThread2("test1"); 
        DemoThread2 t2 = new DemoThread2("test2"); 
        t1.start();
        t2.start();
          
        

	}

}
