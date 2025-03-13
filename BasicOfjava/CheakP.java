package BasicOfjava;

import java.util.Scanner;

public class CheakP {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of you want cheak :");
			int n = sc.nextInt();
			boolean result = false;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					result = true;
					break;
				}
			}
			if (result == true)
				System.out.println("Not Prime : ");
			else
				System.out.println("Prime ");
		}

	}
}
