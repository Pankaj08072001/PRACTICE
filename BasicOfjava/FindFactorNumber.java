package BasicOfjava;

public class FindFactorNumber {
	static String getFactor(int num) {
		if (num == 0)
			return "0";
		else if (num < 0)
			return "-1";
		else {
			String result = "";
			int i = 1;
			while (i <= num / 2) {
				if (num % i == 0) {
					result += " " + i;
				}
				i++;
			}
			return result + " " + num;
		}
	}

	public static void main(String[] args) {
		System.out.println(getFactor(54));
		System.out.println(getFactor(0));
		System.out.println(getFactor(-28));
	}
}
