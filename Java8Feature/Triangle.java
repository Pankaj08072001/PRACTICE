package Java8Feature;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int n = sc.nextInt();
		Runnable rs = () -> {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n - i; j++) {
					System.out.print("  ");
				}
				for (int s = 0; s < 2*i-1; s++) {
					System.out.print((char) (s+97) +" ");
				}
				System.out.println();
			}
		};
		sc.close();
		rs.run();
	}
}
