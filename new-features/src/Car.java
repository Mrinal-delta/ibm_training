
public class Car {
	private String model;
	private String[] features;
//	public Car(String model, String[] features) {
//		this.model = model;
//		this.features = features;
//	}
	
	public Car(String model, String...features) {//var-args
		//it can only be passed as the last parameter and will use the
		//parameters as an array
		this.model = model;
		this.features = features;
	}
	public void specs() {
		System.out.println("Features of "+ model);
		for(String f: features)
			System.out.println(" - "+f);
	}
	
	public static void main(String[] args) {
//		String[] falto = {"Milege: 19.7 kmpl","Fuel type: Petrol","TransmissionType: Manual"};
//		Car alto = new Car("Suzuki Alto",falto);
//		alto.specs();
//		
//		String[] fastor = {"Milege: 20.7 kmpl","Fuel type: Petrol","TransmissionType: Automatic"};
//		Car astor = new Car("Suzuki Alto",fastor);
//		astor.specs();
		
		Car alto = new Car("Suzuki Alto","Keyless","AC","Power Window");
		alto.specs();
		
		Car astor = new Car("Suzuki Alto","ABS","Moon Roof","Keyless");
		astor.specs();
	}
}
