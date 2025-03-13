package ArrayQuestion;

public class GCD {
	public static void main(String[] args) {
		int a = 15;
		int b = 27;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}
}
