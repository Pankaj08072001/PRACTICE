package ArrayQuestion;

import java.util.Arrays;

public class MoveZeroLast {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 0, 2, 1, 0, 2 };
		int b = arr.length - 1;

		for (int i = 0; i < b; i++) {
			if (arr[i] == 0) {
				while (b > i && arr[b] == 0) {
					b--;
			}
				int temp = arr[b];
				arr[b] = arr[i];
				arr[i] = temp;
				b--;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
