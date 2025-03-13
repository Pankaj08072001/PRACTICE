package BasicOfjava;
import java.util.Scanner;
public class ResversenumberPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int orginalNumber = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == orginalNumber)
			System.out.println("Is Palindrome ");
		else
			System.out.println("Not palidrome");
		sc.close();
	}
}
