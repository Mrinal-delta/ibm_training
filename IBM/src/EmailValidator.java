
public class EmailValidator {

	//1-Only 1 occurrences of @ and .
	//2-Min 4 chars before @
	//3-Min 3 chars between @ and .
	//4-Min 2 chars after .
	// Not allowed to use RegEx or Patterns - Use string class methods
	public static void main(String[] args) {
		String email = "zubair@male.com";
		
		int iat = email.indexOf('@');
		int idot = email.indexOf('.');
		
		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat > 3 
				&& idot > (iat + 3) && email.length() > (idot + 2))
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}
}
