
public class Person implements Cloneable {
	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(name) && p.age == this.age)
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("Polo", 21);
		p1.print();
		
//		System.out.println(p1.hashCode());
//		System.out.println(p1);	// Implicitly calls toString() method
//		
//		Person p2 = new Person("Polo", 21);
//		System.out.println(p2.hashCode());
//		System.out.println(p2);
//		
//		System.out.println(p1.equals(p2));
		
		Person pc = (Person) p1.clone();
		System.out.println(pc);
	}
}
