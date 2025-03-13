package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {
	public static void main(String[] args) {
		int arr[] = { 10, 12, 13, 14, 15, 16, 17, 19, 21, 25, 22, 23, 26, 3, 2, 5, 8, 6 };
		Arrays.sort(arr);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int k = sc.nextInt();
		System.out.println("kth smallest is : "+arr[k+1]);
		sc.close();
	}
}
