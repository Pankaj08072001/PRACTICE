package Pattern;

import java.util.Scanner;

public class HollowRectT {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the no of rows Odd :");
			int n = sc.nextInt();
			//int m = sc.nextInt();
			for(int i =1; i<= n; i++){
				for(int j=1; j<= n; j++){
					if((i==1 || i==n|| j==1 || j==n) || ( i== (n/2)+1 && j ==(n/2)+1 ) ) System.out.print("* ");
					else
					System.out.print("  " );
				}
				System.out.println();
			}
		}
	
	}
}
