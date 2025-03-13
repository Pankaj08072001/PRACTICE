package BasicOfjava;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you want cheack Armstrong number :");
		int num = sc.nextInt();
		int originalNumber = num;
		int remender;
		int result = 0;
		while (originalNumber != 0) {
			remender = originalNumber % 10;
			result += Math.pow(remender, countDigit(num));
			originalNumber /= 10;
		}
		if (num == result)
			System.out.println("Is armstrong : ");
		else
			System.out.println("Not Armstrong : ");

		sc.close();
	}
	
	static int countDigit(int num1) {
		int count = 0;
		while (num1 != 0) {
			num1 /= 10;
			count++;
		}
		return count;
	}
}
