
@FunctionalInterface
public interface Hello {
	String sayHello();
	
	//from java 8 interfaces can have fully functional methods declared using default key word
	default String sayBye() {
		return "GoodBye";
	}
	
	//static methods can also be defined inside an interface
	static void greet() {
		System.out.println("Happy Holidays");
	}
}
