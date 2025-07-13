package QuestionOfJava.ArraysQuestion;

import java.util.Arrays;

public class EqualityArrays {
	public static void main(String[] args) {
		int[] arr = { 12, 13, 19, 16, 15, 14, 23, 21 };
		int[] arr1= { 15, 13, 21, 16, 12, 14, 23, 19 };
		boolean flag = true;
		
		if (arr.length != arr1.length) {
			System.out.println("Arrays are not Equal : ");
		} else {
			Arrays.sort(arr);
			Arrays.sort(arr1);
			for (int i = 0; i < arr1.length; i++) {
				if (arr[i] != arr1[i]) {
					flag = false;;
					break;
				}
			}
			if (flag) 
				System.out.println("Arrays is equals : ");
			else 
				System.out.println("Arrays is not equals : ");
		}
	}
}
