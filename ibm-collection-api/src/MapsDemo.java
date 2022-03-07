import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("scott", "tiger");
		map.put("jack", "jill");
		map.put("polo", "lili");
		map.put("jack", "rose");
		
		
//		System.out.println("Scott: "+ map.get("scott"));
//		System.out.println("Polo: "+ map.get("polo"));
//		System.out.println("Jack: "+ map.get("jack"));
		
//		
//		System.out.println(map.getOrDefault(map, "scott"));
		
		//prints a list of keys
		System.out.println(map.keySet());
		
		//prints a list of values
		System.out.println(map.values());
//		System.out.println(map.putAll(map));
		
		//prints a list of all the key value pairs
		System.out.println(map.entrySet());
		
		//for printing key and values 
		//way 1
//		System.out.println("-- Printing of keys and values: ");
//		for (String s :map.keySet()) {
//			System.out.println(s+":"+map.get(s));
//		}
		
		//way 2
//		 map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		 //		for(Map.Entry<String ,String> entry: map.entrySet())
//			System.out.println(entry.getKey()+" : "+entry.getValue());
	}

}
