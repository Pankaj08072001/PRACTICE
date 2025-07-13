package QuestionOfJava.ArraysQuestion;

import java.util.Arrays;

public class MargedTwoArray {
	public static void main(String[] args) {
		int j = 0;
		int arr[] = { 12, 20, 45, 10, 42, 64, 12, 7, 12 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j]=arr[i];
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(arr, j+1)));

		// int arr1[] = { 10, 20, 45, 85, 42, 64, 6, 7, 5 };

		// int[] addArray = new int[arr.length + arr1.length];

		// for (int i = 0; i < arr.length; i++) {
		// addArray[i] = arr[i];
		// }
		// for (int i = 0; i < arr.length; i++) {
		// addArray[arr.length + i] = arr1[i];
		// }

	}
}
