@FunctionalInterface
interface Maths{
//	int square(int n);
//	boolean isOdd(int n);
	int sum(int a, int  b);
}
public class MathDemo {
	public static void main(String[] args) {
//		Maths m1 = (n) -> n*n;
//		
//		Maths m2 = (int n) -> {
//			int sqr = n*n;
//			return sqr;
//		};
//		
//		System.out.println(m1.square(10));
//		System.out.println(m2.square(10));
		
//		Maths o1 = (n) -> n%2 != 0; //? true : false;
//		System.out.println(o1.isOdd(4));
//		System.out.println(o1.isOdd(5));
		
		Maths s1 = (a,b) -> a+b;
		System.out.println(s1.sum(2, 3));
	}
}
