package Pattern;

import java.util.Scanner;

public class ReverseLeftT {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of rows: ");
			int n = sc.nextInt();
			// for(int i = 1; i <=n; i++){
			// 	for(int j =n; j>= i; j--){
			// 		System.out.print("* ");
					
			// 	}
			// 	System.out.println();
			// }

			for(int i = 1; i <=n; i++){
				for(int j =1; j<=i-1; j++){
					System.out.print("  ");	
				}
				for(int s = i; s <= n-1; s++){
				    System.out.print("* ");	
				} 
				System.out.println();
			}
		}
	}
}
