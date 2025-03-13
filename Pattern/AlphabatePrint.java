package Pattern;

import java.util.Scanner;

public class AlphabatePrint {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter your rows number :");
			int s = scan.nextInt();
			for(int i =1; i <= s; i++){
				for(int j = 1 ; j <= s; j ++){
					System.out.print((char)(i+64)+" ");
				}
				System.out.println();
			}
		} 
		
	}
}
