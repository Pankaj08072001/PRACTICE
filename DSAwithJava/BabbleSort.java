package DSAwithJava;

import java.util.Arrays;
import java.util.Scanner;

public class BabbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter your number your array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		babbleSortMeth(arr);
		sc.close();
	}

	public static void babbleSortMeth(int arr[]) {
		System.out.println(Arrays.toString(arr));
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}	
	}
}
