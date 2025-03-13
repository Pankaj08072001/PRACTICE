package ArrayQuestion;

import java.util.Scanner;

public class Test0 {
	public static void main(String[] args) throws Throwable  {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breath = sc.nextInt();
		if (length < 0 || breath < 0) {
			 //throw new Exception("");
		} else {
			int area = length * breath;
			System.out.println(area);
		}
		sc.close();
	}
}
