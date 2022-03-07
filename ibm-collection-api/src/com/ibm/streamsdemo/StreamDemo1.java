package com.ibm.streamsdemo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		Integer[] ar = {2,5,7,6,8,2,3,4};
		
		//convert an array into a list of integers
		List<Integer> num = Arrays.asList(ar);
		
		//new way to iterate over a collection
//		num.forEach(System.out::println);
		
		//creating stream for numbers list
//		Stream<Integer> str1 = num.stream();
//		str1.forEach(System.out::println);
		
		//performing operation again shall give an error as stream is closed
//		str1.forEach(System.out::println);
//		
//		//shorthand to do the same
		num.stream().forEach(System.out::println);
//		
//		//performing intermediate operation
		num.stream().distinct().forEach(System.out::println);
//		
		System.out.println(num.stream().distinct().count());
//		
//		//sorting distinct values before printing
		num.stream().distinct().sorted().forEach(System.out::println);
	
		//calculating sum of numbers in 2 ways
		System.out.println(num.stream().distinct().reduce(0,(a,b) -> a+b));
		System.out.println(num.stream().distinct().reduce(0, Integer::sum));
		
		//creating and working with streams of numbers
		System.out.println(IntStream.range(1,  99).count());
		System.out.println(IntStream.range(1, 9).sum());
		
		System.out.println(IntStream.range(1, 9).skip(5).sum());
		
		//common statistics on Tnteger stream
		IntStream str = IntStream.of(2,5,7,6,8,2,3,4);
		IntSummaryStatistics stats = str.summaryStatistics();
		System.out.println(stats);
	}

}
