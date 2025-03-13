package BasicOfjava;

public class BoxPattern {
	public static String createBoxPattern(int rows, int col) {
		// for (int i = 1; i <= rows; i++) {
		// 	for (int j = 1; j <= col; j++) {
		// 		if (i==1|| i==rows || j == 1 || j == col)
		// 			System.out.print("* ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }
		// return "";

		for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= col; j++) {
					System.out.print("* ");
					
				}
				System.out.println();
			}
			return "";
	}

	public static void main(String[] args) {
		System.out.println(createBoxPattern(8, 10));
	}
}
