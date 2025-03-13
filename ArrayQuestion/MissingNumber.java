package ArrayQuestion;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 7 };
		int n = arr.length + 1;
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				num = i + 1;
				break;
			}
		}
		System.out.println("Missing Number is : " + num);

	}
}