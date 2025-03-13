package Pattern;

import java.util.Scanner;

public class FloyedT {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of rows :");
			int n = sc.nextInt();
			// int a=1;
			// for(int i =1; i<=n; i++){
			// 	for(int j =1; j<= i; j++){
			// 		System.out.print(a++ +" ");
			// 		if(a<10)System.out.print(" ");
			// 	}
			// 	System.out.println();
			// }
      //  0 and 1 Trinangle
			for(int i =1; i<=n; i++){
				for(int j =1; j<= i; j++){
					if((i+j)%2==0 )
					System.out.print(1+" ");
					else 
					System.out.print(0+ " ");
				
				}
				System.out.println();
			}
		}
	}
}
