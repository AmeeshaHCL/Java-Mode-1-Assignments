//code to print the Sum of even digit using static
package com.question1;

public class UserMainCode {
	static int sumOfSquareOfEvenDigits(int number)
	{
		int sum=0;
		while(number!=0)
		{
			int remainder=number%10;
			if(remainder%2==0)
			{
				sum=sum+(remainder*remainder);
				}
			number=number/10;
			}
		return sum;
		}	


}
