package BasicOfjava;

public class GetNumberIncrementfact {
	public static String getNumbersInRange(int start, int end, int step) {
		if (start < 0 || end < 0 || step < 0) {
			return "-1";
		}
		if (start == end) {
			return "-2";
		}

		if (start > end) {
			return "-3";
		}
		for (int i = start; i < end; i++) {
			i += step;
			System.out.print(i + " ");
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(getNumbersInRange(1, 20, 2));
	}
}
