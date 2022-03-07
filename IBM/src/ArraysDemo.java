public class ArraysDemo {

	public static void main(String[] args) {
		int[][] jag = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		
		for (int i = 0; i < jag.length; i++) {
			for (int j = 0; j < jag[i].length; j++) {
				System.out.print(jag[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int[] ar : jag) {
			for (int n : ar) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
		String week = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		for (String s : week.split("-")) {
			System.out.println(s);
		}
	}
}
