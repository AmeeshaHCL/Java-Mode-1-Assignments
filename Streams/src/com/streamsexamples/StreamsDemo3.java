package com.streamsexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo3 {
	public static void main(String[] args) {
		
		List<Integer> values= new ArrayList<>();
		
		for(int i = 1; i<100;i++)
		{
			values.add(i);
		}
		//values.stream().forEach(System.out::println); //using Stream API
		//parallel stream--in order to print multiple or many values. PARALLEL- creates many threads for us- divides in sub
		//parts and then after executing aggregates them 
		
		//values.parallelStream().forEach(System.out::println);
		
		//streams have lot of methods-- in order to process a lot of data
		// 1- Intermediate-- filter(), map() 
		// 2- terminal-- findFirst() , forEach
		values.stream().filter(i -> { 
			System.out.println("HI");
			return true;
		}).findFirst().orElse(0);
		// Streams-- once values used you cannot reuse it
		// Stream is LAZY
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println); //will work
		s.forEach(System.out::println); // Exception
			
		
	
		
		
		
		
		
	}

}
