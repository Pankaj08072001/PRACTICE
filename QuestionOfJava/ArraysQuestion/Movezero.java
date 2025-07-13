package QuestionOfJava.ArraysQuestion;

import java.util.Arrays;

public class Movezero {
	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0, 1, 0, 2, 1, 0, 2 };
		int len = arr.length - 1;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 0) {
				while (arr[len] == 0) {
					len--;
				}
			int temp = arr[len];
			arr[len] = arr[i];
			arr[i] = temp;
			len--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
