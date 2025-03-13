package ArrayQuestion;

import java.util.Arrays;

public class SortZeroOneTWo {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 0, 2, 1, 0, 2 };
		int low =0;
		int mid = 0;
		int high = arr.length-1;

		while(mid <= high){
			if(arr[mid] ==0){
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;

				low++;
			}
			if(arr[mid] == 2){
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;

				high--;
			}
			else{
				mid++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
