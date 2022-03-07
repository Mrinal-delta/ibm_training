
@FunctionalInterface
public interface Currency {
	double dollarvalue();
	
	Currency USD = () -> 1.0;
	Currency INR = () -> 74.50;
	Currency AED = () -> 3.50;
	
	static double convert(Currency source,Currency target, double amount) {
		return (target.dollarvalue()/source.dollarvalue())*amount;
	}
	
}
