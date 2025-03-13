package BasicOfjava;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value You Want factorial of that number :");
		int num = sc.nextInt();
		int fact = 1;
		int i=1;
		while(i <= num){
			fact *= i;
			i++;
		}
		System.out.println("Factorial of this Number is that : "+fact);
		sc.close();
	}
}
