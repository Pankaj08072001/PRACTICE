package BasicOfjava;

public class GetNaturalRange {

	public static String getRange(int num1, int num2) {
		String result = " ";
		for (int i = num1; i < num2; i = +2) {
			if(num1%2==0)
			result += num1;
		}
		return result;
	}

	public static void main(String[] args) {
		getRange(10, 20);
	}
}
