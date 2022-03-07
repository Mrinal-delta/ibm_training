package com.ibm.streamsdemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {

		Map<String, String> people = new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Mili", "Mumbai");
		people.put("Den", "Delhi");
		
//		people.values().stream().forEach(System.out::println);
		//collect all the cities in upper case into a list of String named cites and print
		List<String> cities = people.values().stream().map(c ->c.toUpperCase()).sorted().collect(Collectors.toList());
//		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Frudo",Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Sean",Arrays.asList("2212-3534","5666-7888","8989-4040"));
		contacts.put("Ben",Arrays.asList("2112-3334","5633-1188","8090-2321"));
		
//		contacts.get("Ben").forEach(System.out::println);
//		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
//		contacts.keySet().forEach(s->System.out.println(s+" : "+contacts.get(s)));
		
		//collect all contact numbers into a collection and print that collection
		List<String> number = contacts.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
		number.forEach(System.out::println);
	}

}
