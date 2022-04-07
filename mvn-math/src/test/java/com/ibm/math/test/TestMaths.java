package com.ibm.math.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class TestMaths {

	private static Maths m;
	
	@BeforeAll
	public static void setup() {
		m = new Maths();
	}
	
	@Test
	public void add() {
		assertEquals(16,m.add(7, 9));
	}
	
	@Test
	public void subs() {
		assertEquals(2, m.subs(7, 9));
	}
	
	@Test
	public void div() {
		assertEquals(2,m.div(10, 5));
	}
	
	@Test
	public void divBy0() {
		assertThrows(ArithmeticException.class, ()->m.div(7, 0));
	}
	
	@Test
	public void square() {
		assertEquals(4, m.square(2));
	}
}
