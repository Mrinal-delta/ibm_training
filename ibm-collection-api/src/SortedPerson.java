import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {
		
		/*Treeset is not smart enough to compare objects to add so they need either explicit
		*comparator or we can make the class of which the treeset is creating object of 
		*implement comparable interface and overwrite compareTo method
		*/
		//explicitly declaring the comparator
		Comparator<Person> compAge = (p1,p2) -> p1.getAge() - p2.getAge();
		Comparator<Person> compName = (p1,p2) -> p1.getName().compareTo( p2.getName());
		
		//creating object with explicit comparator
//		TreeSet<Person> people = new TreeSet<>(compAge);
		//creating object with implicit comparable
		TreeSet<Person> people = new TreeSet<>();
		people.add(new Person("Polo",21));
		people.add(new Person("Jack",25));
		people.add(new Person("Lili",23));
		
		for(Person p: people)
			System.out.println(p);
	}
}
