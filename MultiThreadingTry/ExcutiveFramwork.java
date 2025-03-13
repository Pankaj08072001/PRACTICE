package MultiThreadingTry;

public class ExcutiveFramwork {
	public static void main(String[] args) {
			for (int i = 1; i < 10; i++) {
			int finalI = i;
			Thread t = new Thread(
					() -> {
						long result = factorial(finalI);
						System.out.println(result);
					});
			t.start();
		}
	}

	private static long factorial(int n) {
		long result = 1;
		for (int i = 1; i < n; i++) {
			result = result * i;
		}
		return result;
	}
}
