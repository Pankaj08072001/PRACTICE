package ArrayQuestion;

public class LargestSecondLasgest {
	public static void main(String[] args) {
		int arr[] = { 10, 12, 13, 14, 15, 16, 17, 19, 21, 25, 22, 23, 26, 3, 2, 5, 8, 6 };
		int max = 0;
		int smax = 0;

		for (int num : arr) {
			if (num > max) {
				smax = max;
				max = num;
				continue;
			}
			if (num > smax) {
				smax = num;
			}

		}
		System.out.println("Max value is : " + max);
		System.out.println("Max value is : " + smax);
	}
}
