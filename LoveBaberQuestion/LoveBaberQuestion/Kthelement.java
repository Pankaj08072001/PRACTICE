package LoveBaberQuestion;

import java.util.Scanner;

public class Kthelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 15, 20, 19, 21, 48, 57, 46, 23 };

		System.out.println("Enter value you want element : ");
		int i = sc.nextInt();
		if(i<arr.length){
		System.out.println("Your Number is lie on the index : " + arr[i]);
		}else{
			System.out.println("ENter valid idx number : 0 to "+arr.length+ " between");
		}
		sc.close();
	}

}
