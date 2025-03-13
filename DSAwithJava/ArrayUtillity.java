package DSAwithJava;

import java.util.Scanner;

public class ArrayUtillity {
	public static int[] arrayInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter your number your array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}
}
