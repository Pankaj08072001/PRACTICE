package DSAwithJava;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter your number your array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		binarySearchMeth(arr);
		sc.close();
	}

	public static void binarySearchMeth(int b[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number you found : ");
		int find = sc.nextInt();
		int first = 0;
		int last = b.length;
		int k = 0;

		while (first <= last) {
			int m = (first + last) / 2;
			if (b[m] == find) {
				System.out.println("Element is found ");
				k++;
				break;
			} else if (b[m] > find) {
				last = m - 1;
			} else if (b[m] < find) {
				first = m + 1;
			}

		}
		if (k == 0) {
			System.out.println("Element not found : ");
		}
		sc.close();
	}

}
