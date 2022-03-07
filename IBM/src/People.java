import java.security.BasicPermission;

public class People {
	private String name;
	
	public People() {
		name = "Anonymous";
	}

	public People(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}
	
	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("No trespassing") {});
		System.out.println("Name: " + name);
	}
}
