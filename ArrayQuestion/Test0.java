package ArrayQuestion;

import java.util.Scanner;

public class Test0 {
	public static void main(String[] args) throws Throwable  {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			for (int j = size; j >=i; j--) {
				System.out.print(j-i);
			}
			System.out.println();
		}
		sc.close();
		
	}
}
