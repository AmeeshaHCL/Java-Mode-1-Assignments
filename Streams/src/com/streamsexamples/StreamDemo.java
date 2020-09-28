package com.streamsexamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		/*for(int i=0; i<6; i++) // using normal for loop
		{
			System.out.println(values.get(i));	
		}*/
		/*Iterator<Integer> i = values.iterator();
		while(i.hasNext()) // enhanced method using while
		{
			System.out.println(i.next());
		}*/
		
		for (int i  : values) //enhanced for loop 
		{
			System.out.println(i);
			
		}
		// external iterations-- fetch values outside
		//internal iterations-- modified way-- we use stream APIs
		
		values.forEach(i -> System.out.println(i));
		
		
	}
	
	

}
