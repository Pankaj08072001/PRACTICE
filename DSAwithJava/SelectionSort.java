package DSAwithJava;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 10, 25, 14, 12, 13, 16, 17, 18 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length-1; i++) {
			int min = arr[i];
			int index = i;
			int j;
				for ( j = i + 1; j < arr.length-1; j++) {
					if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
}
