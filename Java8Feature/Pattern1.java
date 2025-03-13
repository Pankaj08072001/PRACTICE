package Java8Feature;

import java.util.Scanner;
//import java.util.concurrent.Callable;

public class Pattern1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number : ");
		int n = sc.nextInt();
		// Callable <Integer>rs = () -> {
		// 	for (int i =1;  i <= n; i++) {
		// 		for(int s =1; s<=n-i; s++){
		// 			System.out.print("  ");
		// 		} 
		// 		for(int j =1; j <=i; j++){
		// 			System.out.print(" *");
		// 		}
		// 		System.out.println();
		// 	}
		// 	sc.close();
		// 	return 0;
		// };
		// // rs.call();
		// System.out.println(rs.call()); 


		Runnable rs = () -> {
			for (int i =1;  i <= n; i++) {
				for(int s =1; s<=n-i; s++){
					System.out.print("  ");
				} 
				for(int j =1; j <=i; j++){
					System.out.print(" *");
				}
				System.out.println();
			}
			sc.close();
		};
		rs.run();
	}
}
