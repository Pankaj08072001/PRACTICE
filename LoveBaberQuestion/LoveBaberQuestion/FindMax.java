package LoveBaberQuestion;

import java.util.Arrays;

public class FindMax {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 19, 21, 48, 57, 46, 23 };
		Arrays.sort(arr);
		//Max(arr);
		Min(arr);
		//System.out.println(Arrays.toString(arr));

	}

	public static int[] Max(int brr[]) {
		int max = brr[0];
		for (int i = 0; i < brr.length; i++) {
			if (max < brr[i]) {
				max = brr[i];
			}
		}
		System.out.println(" Maximun value is : "+max);
		return null;
	}

	public static int[] Min(int brr[]) {
		int min = brr[0];
		for (int i = 0; i < brr.length; i++) {
			if (min > brr[i]) {
				min = brr[i];
			}
		}
		System.out.println(" Minimum value is : "+min);
		return null;
	}
}