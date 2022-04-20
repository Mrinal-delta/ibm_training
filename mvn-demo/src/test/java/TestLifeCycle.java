import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifeCycle {
	private List<String> cart;
	
	@BeforeAll
	public static void setup() {//executes before all test cases
		System.out.println("Setup before all test case");
	}
	
	@AfterAll
	public static void tearDown() {//executes after all test cases
		System.out.println("Teardown after all test cases");
	}

	@BeforeEach
	public void setupEach() {
		cart = new ArrayList<>();
		System.out.println("Setup before each test case");
	}
	
	@AfterEach
	public void teardownEach() {
		cart = null;
		System.out.println("Teardown after each test case");
	}
	
	@Test
	public void testOneItem() {
		cart.add("iphone");
		assertEquals(1, cart.size());
		System.out.println("Testing cart with 1 item");
	}
	
	@Test
	public void testEmptyCart() {
//		cart.add("iphone");
		assertTrue(cart.isEmpty());
		System.out.println("Testing empty cart");
	}
}

