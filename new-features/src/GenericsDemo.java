
public class GenericsDemo<Z> {
	private Z data;

	public GenericsDemo(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenericsDemo<String> d1 = new GenericsDemo<String>("Hello");
		System.out.println(d1.getData());
		
		GenericsDemo<Integer> d2 = new GenericsDemo<Integer>(1000);
//		d2.setData("JAVA");//this should not be the case if the object is created using integer it should only allow integer
		//to counter this issue Generics are introduced where class is generic but objects are specific
		System.out.println(d2.getData());
		
	}
}

