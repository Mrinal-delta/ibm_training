import static java.lang.System.out;
import static java.lang.Math.*;

public class ImportsDemo {

	//5 static fields are used
	public static void main(String[] args) {
		//out is declared static
//		System.out.println("Hello");
//		
//		//Math is final as all it contains is static
//		//PI is static
//		System.out.println(Math.PI);
//		
//		//random is a static method
//		System.out.println(Math.random());
		
		//after importing we don't have to declare System and Math again
		out.println("Hello");
		out.println(PI);
		out.println(random());
	}

}
