package ArrayQuestion;

import java.util.Arrays;

public class ResveredArray {
	public static void main(String[] args) {
		int arr[] = {10,15,12,14,16,17};
		Arrays.sort(arr);
		int temp =0;
		int ist = 0;
		int lst = arr.length-1;

		for (int i = 0; i < lst; i++) {
			temp = arr[ist];
			arr[ist] = arr[lst];
			arr[lst] = temp;

			lst--;
			ist++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
