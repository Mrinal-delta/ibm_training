
public class ThreadControl extends Thread {
	public ThreadControl(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while(true) {
			System.out.println(name);
			yield();
//			try {
//				//to print the output alternatively
//				Thread.sleep(1);//there is a cost in doing this as after some time the time will increase
//			}catch(InterruptedException e) {}
		}
	}


	public static void main(String[] args) {
		Thread t1 = new ThreadControl("Hello");
		Thread t2 = new ThreadControl("World");
		
		t1.start();
		t2.start();
	}

}
