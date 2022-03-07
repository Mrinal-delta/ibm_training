
public class HelloDemo {
	public static void main(String[] args) {
		Hello h1 = () -> "Hello Lambda";//in case of single line return is optional
		System.out.println(h1.sayHello());
		
		Hello h2 = () ->{
			String greeting = "Hola Lambda";
			return greeting;//multiline return is needed
		};
		System.out.println(h2.sayHello());
		System.out.println(h2.sayBye());
		
		Hello.greet();
	}
}
