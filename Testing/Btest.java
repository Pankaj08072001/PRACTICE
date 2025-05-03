package Testing;

import java.util.Arrays;

public class Btest {
	public static void main(String[] args) {
		int arr[] = { 10, 12, 13, 14, 15, 16, 17, 19, 21};
		Arrays.sort(arr);
		int last = arr.length-1;
		int find = 121;
		int first =0;
		int k =0;
		
		while (first <= last) {
			int m = (first + last) / 2;
			if (arr[m] == find) {
				System.out.println("Element is found ");
				k++;
				break;
			} else if (arr[m] > find) {
				last = m - 1;
			} else if (arr[m] < find) {
				first = m + 1;
			}

		}
		if (k == 0) {
			System.out.println("Element not found : ");
		}

	}
}
