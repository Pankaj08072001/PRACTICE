package ArrayQuestion;

import java.util.Scanner;

public class ResversedNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number : ");
		int num = sc.nextInt();
		String res = "";
		while (num != 0) {
			res += num%10; 
			num/=10;
		}
		System.out.println(res);
		sc.close();
	}
}
