package com.thread;

public class Number implements Runnable 
{
Thread t;
Thread t1;
Thread t2;
int n;


	@Override
	public void run() 
	{
		for(int i = 1; i<=n; i++)
		{
			if(n%2==0 && n%5==0 && n%8==0)
			{
				System.out.println("These are the multiples of the number");
			}
		}
					
	}
		
}


