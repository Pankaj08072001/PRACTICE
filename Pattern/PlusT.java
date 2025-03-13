package Pattern;

import java.util.Scanner;

public class PlusT {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number rows : ");
			int n =sc.nextInt();
			int mid =(n/2) +1;
			for(int i =1; i<= n; i++){
				for(int j=1; j<= n; j++){
					if(j== mid || i == mid)System.out.print("* ");
					else
					System.out.print("  ");
				}
				System.out.println();
			}                                                                                                                                                               
		}
	}
}
