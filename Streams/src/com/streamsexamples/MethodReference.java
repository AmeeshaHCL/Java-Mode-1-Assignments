package com.streamsexamples;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//values.forEach((System.out::println)); // System -- class , having out--Object and println is a method
		// Call by Method Reference
		//values.forEach((i -> doubleIt(i)));
		values.forEach(MethodReference::doubleIt);// class and the function
		
	}
	public static void doubleIt(int i)
	{
		System.out.println(i*2);
	}
}
