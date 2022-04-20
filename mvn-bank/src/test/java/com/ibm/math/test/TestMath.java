package com.ibm.math.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class TestMath {
	private static Maths m;
	
	@BeforeAll
	public static void setup() {
		m = new Maths();
	}
	
	@Test
	public void testAdd() {
		assertEquals(15, m.add(7, 8));
	}
	
	@Test
	public void testSubPositive() {
		assertEquals(1, m.subs(8, 7));
	}
	
	@Test
	public void testSubNegative() {
		assertEquals(-1, m.subs(7, 8));
	}
	
	@Test
	public void testDiv() {
		assertEquals(15, m.div(30, 2));
	}
	
	@Test
	public void testZeroDiv() {
		assertThrows(ArithmeticException.class,()-> m.div(30, 0));
	}
	
	
	@Test
	public void testSquare() {
		assertEquals(25, m.square(5));
	}
	
	@Test
	public void testIncorrectSquare() {
		assertNotEquals(9, m.square(6));
	}
	
	
}
