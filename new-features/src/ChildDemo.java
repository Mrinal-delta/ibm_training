
public class ChildDemo<Z> extends GenericsDemo<Z> {
public ChildDemo(Z data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

//	private S temp;
//	public ChildDemo(Z data,S temp) {
//		super(data);
//		this.temp = temp;
//	}
//	
//	public S getTemp() {
//		return temp;
//	}
//
//	public void setTemp(S temp) {
//		this.temp = temp;
//	}

	public static void main(String[] args) {
//		ChildDemo<String,Integer> c1 = new ChildDemo<String,Integer>("Hello",10);
//		System.out.println(c1.getData() +"\t"+c1.getTemp());
		ChildDemo<String> c1 = new ChildDemo<String>("Hello");
		System.out.println(c1.getData());
	}
}
