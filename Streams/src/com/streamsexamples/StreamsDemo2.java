package com.streamsexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamsDemo2 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		/*Consumer<Integer> consumer= new Consumer<Integer>() 
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		}; //functional Interface--SAM
		
*/		
		//Consumer<Integer> consumer =(Integer i) -> System.out.println(i); //more efficient way by streams
		//Consumer<Integer> consumer =i -> System.out.println(i);

		values.forEach(( i -> System.out.println(i))); // LOC to 1 line

	}

}
