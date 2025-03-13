package Pattern;

import java.util.Scanner;

public class StarRectangle {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of line :");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
	}
}
