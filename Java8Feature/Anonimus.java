package Java8Feature;

import java.util.Scanner;

public class Anonimus {
	public static void main(String[] args) {
		// InnerClass i = () -> 100;
		// System.out.pIrintln("Sallery is : "+i.getSallery());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows you Want to Draw a Pattern : ");
		int n = sc.nextInt();
		Runnable ra = () -> {
			for (int i = 0; i < n; i++) {
				for (int s = 0; s < n - i; s++) {
					System.out.print("  ");
				}
				for (int j = 0; j < i+1; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		};
		ra.run();
		sc.close();
	}

}