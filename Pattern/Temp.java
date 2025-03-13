package Pattern;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows :");
			int n = sc.nextInt();
			int nsp = n-1 , nst =1;
			for (int i = 1; i <= n; i++) {
				for (int s = 1; s <= nsp; s++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= nst; j++) {
					System.out.print("* ");
				}
				nsp--;
				nst+=2;
				System.out.println();
			}

		}

	}
}
