package DSAwithJava;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrays : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		SequenceSearch(arr);
		sc.close();
	}

	static void SequenceSearch(int brr[]) {
		Arrays.sort(brr);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number you want to search : ");
		int j = sc.nextInt();
		int k = 0;

		for (int i = 0; i < brr.length - 1; i++) {
			if (brr[i] == j) {
				System.out.println("Element is found : ");
				k++;
				break;
			}
		}
		sc.close();
		if (k == 0) {
			System.out.println("Element is not found : ");
		}
	}
}
