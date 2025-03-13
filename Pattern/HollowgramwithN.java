package Pattern;

import java.util.Scanner;

public class HollowgramwithN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows Odd :");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int value = Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1)) + 1;
				System.out.print((size - value)+"" );
				System.out.print("	");
			}

			System.out.println();
		}
		sc.close();
	}
}
