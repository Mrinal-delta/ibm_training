import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PeopleReflection {

	public static void main(String[] args) {
		
		People p = new People("Hansa");
		System.out.println(p);
		
		Class pc = p.getClass();
		System.out.println(pc.getName());
		
		System.out.println("-- List of constructors");
		Constructor[] constructors = pc.getConstructors();
		for (Constructor c : constructors) 
			System.out.println(c);
		
		System.out.println("-- List of methods");
		Method[] methods = pc.getMethods();
		for (Method m : methods) 
			System.out.println(m);

		System.out.println("-- List of declared methods");
		Method[] decMethods = pc.getDeclaredMethods();
		for (Method m : decMethods) 
			System.out.println(m);
		
		// Print fields of People class
		System.out.println("-- List of declared fields");
		Field[] fields = pc.getDeclaredFields();
		for (Field f : fields) 
			System.out.println(f);
	}
}
