package com.streamsexamples;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapStreams {
	public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//int result=0;
		/*for (int i : values) {
			
			result= result +i;
			
		}*/
		//System.out.println(result);
		// values of result is changing 7 times , no concurrency is achieved 
		// to achieve  concurrency we need to reduce the iterations in order to make the system fast
		// Stream API is used here in order to print the stream of values-- belongs to Collection Interface
		// use of map function-- reduces the LOC to one line
		//System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
		
		//Function<Integer,Integer> f= new Function<Integer,Integer>() //functional interface--Function
		//{
			//public Integer apply(Integer i)
			//{
				//return i*2;
			//}//defining methods
			
		//};
		/*BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			
			public Integer apply(Integer i, Integer j)
			{
				return i+j;
			}
		};*/
		
		//Stream<Integer> s= values.stream();
		
		/*Stream s1 = s.map(new Function<Integer,Integer>() //functional interface--Function
		{
			public Integer apply(Integer i) //inner classes
			{
				return i*2;
			}//defining methods
		});
		Integer result =(Integer) s1.reduce(0,new BinaryOperator<Integer>() {
			
			public Integer apply(Integer i, Integer j)
			{
				return i+j;
			}
		});
		
		//s.forEach(System.out::println);
		System.out.println(result);
		*/
		// INTERMEDIATE OPERATIONS

		System.out.println(values.stream().map(i-> i*2).reduce(0,(c,e) -> c+e));// directly 
		
		System.out.println(values.stream().map(i-> i*2).reduce(0,(c,e) -> Integer.sum(c,e)));// using sum function
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum)); //method  reference
		
		
		
		
	}
}


