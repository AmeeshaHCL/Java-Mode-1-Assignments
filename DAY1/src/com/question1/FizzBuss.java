//java program to print Fizz Buzz

package com.question1;

public class FizzBuss {

	public static void main(String[] args) 
	{
		int number= 100;
	
		  for(int i=1;i<number;i++) //iterating loop for 100 times
		  {
			  if (i%5==0) { // number multiple of 5, print "Buzz"
				System.out.println("Buzz" + " ");
				}
			  else if (i%3==0) {
				  System.out.println("Fizz" + " "); // number a multiple of 3 so print "Fizz"
			  }
			  else if (i%3==0&&i%5==0) {
				System.out.println("FizzBuzz" + " ");
			}
			  else {
				System.out.println(i + " "); // print the numbers
			}
		} 
	}
}
				 
			          
			
					
