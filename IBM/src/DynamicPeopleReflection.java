import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicPeopleReflection {

	public static void main(String[] args) throws Exception {
		
		// Manually loading a class 
		Class pc = Class.forName("People");
		System.out.println(pc.getName());
		
		// Getting default constructor of the class
		Constructor c1 = pc.getConstructor(null);
		// Instantiate class with default constructor
		Object p1 = c1.newInstance(null);
		System.out.println(p1);
		
		// Getting parameterised constructor
		Constructor c2 = pc.getConstructor(String.class);
		// Instantiating with parameterised constructor
		Object p2 = c2.newInstance("Veena");
		System.out.println(p2);
		
		// Getting print method
		Method m1 = pc.getDeclaredMethod("print", null);
		// Setting accessibility
		m1.setAccessible(true);
		// Invoking method on p2 object
		m1.invoke(p2, null);
		
	}
}
