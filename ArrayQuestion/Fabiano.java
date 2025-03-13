package ArrayQuestion;

import java.util.Scanner;

public class Fabiano {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 1; i <= value; i++) {
			System.out.print(c + " ");
			c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}
}
