package Pattern;

import java.util.Scanner;

public class Piraramid {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows :");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int s = i; s < n; s++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= (2*i-1); j++) {
					System.out.print(" *" );
				}
				System.out.println();
			}
			for(int i =n-1; i>=1; i--){
				for(int s = i; s < n; s++){
					System.out.print("  ");
				}
				for(int j =1; j<=(2*i -1); j++){
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}
