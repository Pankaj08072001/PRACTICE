package Pattern;

import java.util.Scanner;

public class LeftTri {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows :");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int s = 1; s <= n - i; s++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}



			// for(int i = 1; i<= n; i++){
			// for(int j =1; j<=n; j++){
			// if(i+j >n)System.out.print("* ");
			// else
			// System.out.print(" ");
			// }
			// System.out.println();
			// }

		}
	}
}
