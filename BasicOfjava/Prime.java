package BasicOfjava;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want cheak  : ");
		int n = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("not prime " + n);
		}
		else {
			System.out.println("Prime Number : " + n);
		}
sc.close();
	}
}
