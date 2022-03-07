package com.ibm.My;
import java.util.Comparator;
import java.util.Vector;

public class MyVectorDemo {

	public static void main(String[] args) {
		//Vector is synchronized
		Comparator<String> cs = (p1,p2) -> p1.compareTo(p2);
		
		Vector<String> v1 = new Vector<>();
		v1.add("Hello");
		v1.add("world");
		v1.add("Call");
		
		System.out.println(v1.capacity());
		
		//Printing the elements of the vector
		System.out.println();
		for(String i:v1)
			System.out.println(i);
		
		//sorting using a comparator
		v1.sort(cs);
		for(String i:v1)
			System.out.println(i);
	}

}
