package Exceptiontry;

import java.util.Scanner;

public class UseBlock {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number a and b : ");
			int a = sc.nextInt();
			int b = sc.nextInt();

			try {
				System.out.println(a/b);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
