package QuestionOfJava.ArraysQuestion;

import java.util.Arrays;

public class MoveNegative {
	public static void moveElement(int arr[]) {
		System.out.println("Moving elements... Positive and Negative..");
		int i = 0;
		int high = arr.length - 1;

		while (i <= high) {
			if (arr[i] > 0) {
				int temp = arr[i];
				arr[i] = arr[high];
				arr[high] = temp;
				high--;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int brr[] = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		moveElement(brr);
	}
}
