package ArrayQuestion;

import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5, 6, 4, 5, 4, 2, 4 };
		Arrays.sort(arr);
		// int j = 0;
		// for (int i = 0; i < arr.length; i++) {
		// 	if (arr[i] != arr[j]) {
		// 		j++;
		// 		arr[j] = arr[i];
		// 	}
		// }
		// System.out.println(Arrays.toString(Arrays.copyOf(arr, j + 1)));
		HashSet <Integer> hs = new HashSet<>();
		for (int num : arr) {
			hs.add(num);
		}
		System.out.println(hs);
	}
}
