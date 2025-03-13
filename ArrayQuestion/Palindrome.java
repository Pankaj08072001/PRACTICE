package ArrayQuestion;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int s = str.length() - 1;
		String str1 = "";
		for (int i = 0; i <= s; i++) {
			str1 = str1 + str.charAt(s - i);
		}
		System.out.println(str1);

		if (str.equals(str1)) {
			System.out.println("Is Palindrome ");
		} else {
			System.out.println("Is Not Palindrome ");
		}
		sc.close();
	}
}
