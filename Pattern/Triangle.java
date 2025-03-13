package Pattern;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rows :");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			for (int j=n-i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int s = 1; s <= (2 * i - 1); s++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		sc.close();
	}
}