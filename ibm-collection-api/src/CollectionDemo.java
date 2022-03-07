import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addLast("Apache");
		lst.add(2, "Oracle");
		
		System.out.println("-- Iterating using for loop: ");
		for(int i=0;i<lst.size();i++)
			System.out.println(lst.get(i));
		
		System.out.println("-- Iterating using for Iterator: ");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-- Iterating using for-each loop: ");
		for(String e: lst)
			System.out.println(e);
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");
		
		ar.addAll(lst);//merging a collection into another
		System.out.println("-- Iterating over a merged collection: ");
		for(String e:ar)
			System.out.println(e);
		
		HashSet<String> hset = new HashSet<String>(ar);
		System.out.println("-- Iterating over hash set collection: ");
		for(String e:hset)
			System.out.println(e);
		
		TreeSet<String> tset = new TreeSet<String>(ar);
		System.out.println("-- Iterating over tree set collection: ");
		for(String e:tset)
			System.out.println(e);
		
	}

}
