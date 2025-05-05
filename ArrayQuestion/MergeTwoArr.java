package ArrayQuestion;

import java.util.Arrays;

public class MergeTwoArr {
	public static void main(String[] args) {
		int arr1[] ={2,4,3,6,5};
		int arr2[] ={3,9,6,8,10};

		int merge[] = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }

		// System.arraycopy(arr1,0,marge , 0, arr1.length);
		
		// System.arraycopy(arr2,0,marge , arr2.length,arr1.length);

		//Arrays.sort(merge);

		System.out.println(Arrays.toString(merge));
	}
}
