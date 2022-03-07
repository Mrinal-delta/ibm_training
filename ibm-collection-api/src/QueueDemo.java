import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.offer("Apple");
		q.offer("Banana");
		q.offer("Cherry");
		
		for(String i:q)
			System.out.println(i);
		
		//Fetch value but does not removes it
		System.out.println(q.peek());
		
		//Fetch value and removes from the queue
		while(!q.isEmpty())
			System.out.println(q.poll());
		
	}

}
