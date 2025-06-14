package InterviewQuestion;

import java.util.Scanner;

public class Findelement {
	public static void main(String[] args) {
		int arr[] = {10,15,12,52,16,17,1,78};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number you want search ");
		int n = sc.nextInt();
		int k =0;

		for (int i : arr) {
			if(i==n){
				System.out.println("Element is :"+ i);
				k++;
				break;
			}
		}
		if(k==0){
			System.out.println("Element is not found ");
		}
		sc.close();
	}

}
