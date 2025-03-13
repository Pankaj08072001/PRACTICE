package BasicOfjava;

public class StringWithSpace {
	public static String getFourPerLine(int num) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			System.out.print(num - i + " ");
			count++;
			if (count % 4 == 0) {
				System.out.println();
			}
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(getFourPerLine(100));

	}
}
