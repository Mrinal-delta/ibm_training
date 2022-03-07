package com.ibm.streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> basket = Arrays.asList("Mange","Banana","Apple","Papaya","Orange");
		System.out.println();
		basket.forEach(System.out::println);
		
		System.out.println();
		basket.stream().forEach(System.out::println);
		
		Stream<String> str = Stream.of("Mange","Banana","Apple","Papaya","Orange");
//		System.out.println();
//		str.sorted().forEach(System.out::println);
		
//		System.out.println();
//		str.map(s -> s.toUpperCase()).forEach(System.out::println);
		
		System.out.println();
		str.map(s -> s.contains("a")).forEach(System.out::println);
	}

}
