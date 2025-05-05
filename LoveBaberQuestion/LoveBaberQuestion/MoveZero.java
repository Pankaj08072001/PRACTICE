package LoveBaberQuestion;

import java.util.Arrays;

public class MoveZero {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 8, 9, 5, 8, 4, 7, 5, 7, 2, 5, 1, 4, 5 };
		//Arrays.sort(arr);
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j]=arr[i];
			}
			
		}
		System.out.println(Arrays.toString( Arrays.copyOf(arr, j+1)));
	}
}
