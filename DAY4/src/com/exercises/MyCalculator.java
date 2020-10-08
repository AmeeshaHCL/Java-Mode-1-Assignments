package com.exercises;

public class MyCalculator implements AdvanceArithmetic //Class that implements an Interface
{
	@Override
	public int divisor_sum(int n) // method to calculate and return sum of divisor
	{
        int sum = 0;
        for (int i = 1; i <= n; i++) {
         if (n % i == 0) 
         {
            sum = sum+i;
        }
    }
		return sum;
    }

}
