package InterviewQuestion;

import java.util.Arrays;

//import java.util.Arrays;

public class MoveZero {
	public static void main(String[] args) {
		// int[] arr = { 0, 1, 2, 0, 0, 0, 1, 0, 2, 1, 0, 2, 0, 0, 0, 2, 5, 7, 6, 0, 0
		// };
		// int last = arr.length - 1;
		// for (int i = 0; i < last; i++) {
		// if (arr[i] == 0) {
		// while (arr[last] == 0) {
		// last--;
		// }
		// int temp = arr[last];
		// arr[last] = arr[i];
		// arr[i] = temp;
		// last--;
		// }
		// }
		// System.out.println(Arrays.toString(arr));

		int[] arr = { 0, 1, 2, 0, 0, 0, 1, 2, 1, 2, 0, 0, 0, 2, 5, 7, 6, 0, 0, 0, 0, 0 };

		int last = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[last--] = arr[i];
			}
		}
		while (last >= 0) {
			arr[last--] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}
}
