package com.streamsexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterStream {
	public static void main(String[] args) {
		 List<Integer> values =  Arrays.asList(12,20,35,46,55,68,75);
		 int result=0;
		 for(int i: values)
		 {
			 if(i%5==0)
			 {
				 result += i;
			 }
		 }
		 /*Predicate<Integer> p = new Predicate<Integer>() {
			 public boolean test(Integer i)
			 {
				 return i%5==0;
			 }
		};*/
		 //System.out.println(result);
		 //System.out.println(values.stream()
				// .filter(i -> i%5==0)
				 //.reduce(0,(c,e) -> c+e));// filter method--only filters up the number divisible by5
		 
		 /*System.out.println(values.stream()
				 .filter(p)
				 .reduce(0,(c,e) -> c+e));// using predicate 
		*/ 
		 /*System.out.println(values.stream()
				 .filter( new Predicate<Integer>() {
					 public boolean test(Integer i)
					 {
						 return i%5==0;
					 }
				 })// anornomyous class
				 .reduce(0,(c,e) -> c+e));// filter method--only filters up the number divivsble by5
		*/ 
		 //findFirst() function in streams
		 System.out.println(values.stream()
				 .filter(i -> i%5==0)//lazy method
				 .map(i -> i*2)
				 .findFirst()// eager method--it should print 20 -- as i*2-- Optional[40] as java is efficient and says it can be a divisible of 5 
				 .orElse(0));// if not 
		
		
		 
	}

}
