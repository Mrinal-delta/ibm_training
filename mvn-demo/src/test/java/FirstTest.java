import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class FirstTest {
	
	@Test
	public void testNull() {
		String s = null;
		assertNull(s);
	}
	
	@Test
	public void testSame() {
		String s1 = "Hello";
		String s2 = "Hello";
		assertSame(s1,s2);
	}
	
}
