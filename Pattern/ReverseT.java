package Pattern;

import java.util.Scanner;

public class ReverseT {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter the number of rows :");
			int n = sc.nextInt();
			// for(int i = n; i >= 0; i--){
			// 	for(int j = i; j >= 0 ; j --){
			// 		System.out.print("* ");
			// 	}

			// 	System.out.println();
			// }

			for(int i = 1; i <= n; i++){
				for(int j = 1; j <=n+1 -i; j++){
					if(i %2 !=0)
					System.out.print((char)(i+64)+" ");
					else
					System.out.print(i+" ");
				}

				System.out.println();
			}
		}
	}
}
