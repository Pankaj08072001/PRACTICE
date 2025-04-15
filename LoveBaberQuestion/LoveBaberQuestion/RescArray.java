package LoveBaberQuestion;

import java.util.Arrays;

public class RescArray{
	public static void main(String[] args) {
		int arr[]  ={10,15,20,19,21,48,57,46,23};
		Arrays.sort(arr);
		res(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int [] res (int brr[]){
		int i=0;
		int idx = brr.length-1;
		while (i<idx) {
			int temp = brr[i];
			brr[i] = brr[idx];
			brr[idx] = temp;	
			i++;
			idx--;
		}
		return brr;
	}
}