package InterviewQuestion;

import java.util.Arrays;

public class ArrayEqualitiy {
	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 5, 6, 7 };
		int[] arr2 = { 5, 3, 6, 4, 7 };

		boolean areEqual = true;

		// First check if lengths are equal
		if (arr1.length != arr2.length) {
			areEqual = false;
		} else {
			// Compare elements one by one
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					areEqual = false;
					break;
				}
			}
		}

		// Output result
		if (areEqual) {
			System.out.println("Arrays are equal.");
		} else {
			System.out.println("Arrays are NOT equal.");
		}
	}
}
