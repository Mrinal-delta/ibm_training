


import java.util.ArrayList;
import java.util.stream.Stream;

public class PersonStreamDemo {

	public static void main(String[] args) {
		ArrayList<Person> pr = new ArrayList<>();
		pr.add(new Person("Angel",21));
		pr.add(new Person("Martin",10));
		pr.add(new Person("Louis",15));
		pr.add(new Person("Kyle",20));
		pr.add(new Person("John",25));
		
		pr.forEach(System.out::println);
		System.out.println();
		
		Stream<Person> e = pr.stream();
//		e.map(s -> (s.getAge()>15)?s.getName():"").forEach(System.out::println);
//		e.map(s -> s.getAge()>15?s.getName():"").forEach(s -> s != ""?System.out.println(s):System.out.print(" "));
//		System.out.println(e.anyMatch(s-> s.getAge()>15));
		e.filter(s -> s.getAge()>15).forEach(s -> System.out.println(s.getName()));
//		e.sorted().forEach(System.out::println);
	}

}
