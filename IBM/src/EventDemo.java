
class EventImpl implements Event {

	@Override
	public void perform() {
		System.out.println("First performance");
	}
}

public class EventDemo {
	
	class InnerEventImpl implements Event {
		@Override
		public void perform() {
			System.out.println("Second performance");
		}
	}
	
	static class StaticInnerEventImpl implements Event {
		@Override
		public void perform() {
			System.out.println("Third performance");
		}
	}
	
	public void anotherEvent() {
		class NestedEventImpl implements Event {
			@Override
			public void perform() {
				System.out.println("Forth performance");
			}
		};
		new NestedEventImpl().perform();
	}
	
	public void oneMoreEvent() {
		Event e = new Event () {	// Anonymous inner class
			@Override
			public void perform() {
				System.out.println("Fifth performance");
			}
		};
		e.perform();
	}
	
	public void oneLastEvent() {
		Event e = () -> System.out.println("Sixth performance");	// Lambda expression
		e.perform();
	}
	
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();
		
		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.perform();
		
		EventDemo.StaticInnerEventImpl se = new EventDemo.StaticInnerEventImpl();
		se.perform();
		
		ed.anotherEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
		
	}
}
