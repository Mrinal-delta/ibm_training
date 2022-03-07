import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {

		//creating user defines locale
		Locale hindi = new Locale("hi");
		//as default locale of our system is english thus it is giving the english one
//		ResourceBundle bundle = ResourceBundle.getBundle("msgs");
		
		//by passing another parameter in Locale.localename then we can show message in a different locale
		ResourceBundle bundle = ResourceBundle.getBundle("msgs",hindi);
		
		System.out.println(bundle.getString("greetings"));
		System.out.println(bundle.getString("message"));
	}

}
