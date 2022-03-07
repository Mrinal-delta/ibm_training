import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2020,04, 14);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2017-02-19");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(10));
		System.out.println(d2.plus(2, ChronoUnit.WEEKS));
		
		System.out.println(d2.plus(2, ChronoUnit.MONTHS));
		System.out.println(d3.plus(1, ChronoUnit.YEARS));
		
		System.out.println(d2.getDayOfWeek());
		System.out.println(d1.isLeapYear());
		
		//write a code 
		LocalDate by = LocalDate.of(1998, 05, 03);
		System.out.println(d1.getYear()-by.getYear());
	}
}
