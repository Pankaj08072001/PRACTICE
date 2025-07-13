package QuestionOfJava.ArraysQuestion;

import java.util.Arrays;

public class Resverarray {
	public static void main(String[] args) {
		System.out.println("Hello World !!");
		int arr[] = {10,15,20,48,69,75,84,35,5,28,33,24};
		int last = arr.length-1;
		int i =0;
		while(i<last) {
			int temp = arr[i];
			arr[i] = arr[last];
			arr[last]= temp;
			last--;
			i++;
			}
		System.out.println(Arrays.toString(arr));
	}
}