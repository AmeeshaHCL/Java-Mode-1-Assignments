//Program to print the sum of odd digit LOGIC CODE
package com.question1;

public class SumOfOddDigits {
	static int checkodd(int number)
	{
		int sum=0,result;
		while(number!=0)
		{
			int remainder=number%10;
			if(remainder%2!=0)
			{
				sum=sum+remainder;
			}
			number=number/10;
		}
		if(sum%2!=0)
		{
			result=1;
		}
		else
		{
			result=-1;
		}
		return result;
	}


}
