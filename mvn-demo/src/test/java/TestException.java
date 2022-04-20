import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestException {
	
	@Test
	public void testDivision() {
		assertThrows(ArithmeticException.class,()->{int x = 1/0;});
	}
	
	
	@Test
	public void testParse() {
		assertThrows(NumberFormatException.class,()->Integer.parseInt("one"));
	}
	
	
}
