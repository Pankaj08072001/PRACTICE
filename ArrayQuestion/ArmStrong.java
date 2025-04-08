package ArrayQuestion;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num = sc.nextInt();
		int lastnum;
		int temp = num;
		int totalSum = 0;
		while (num != 0) {
			lastnum = num % 10;
			totalSum += Math.pow(lastnum, count(temp));
			num /= 10;
		}
		System.out.println(totalSum);
		if (temp == totalSum) {
			System.out.println("Is it Aanagram : ");
		} else {
			System.out.println("Not a Aanagram");
		}
		sc.close();
	}

	public static int count (int n){
		int count =0;
		while (n!=0) {
			n/=10;
			count++;
		}
		return count;
	}
}
