package Java8Feature;

import java.util.Scanner;

public class CheakPtime {
	public static void main(String[] args) {
		Runnable ra = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Number : ");
			int n = sc.nextInt();
			boolean isPrime = false;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime ) {
				System.out.println("Number is not Prime ");
			} else {
				System.out.println("Number is Prime ");
			}
			sc.close();
		};
		ra.run();
	}
}
