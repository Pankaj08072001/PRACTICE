class test {
	public static void main(String args[]) {
		System.out.println("For maximum number finding ......");
		int a[] = { 2, 5, 6, 5, 4, 53, 23, 43, 54, 2, };
		 int max = a[0];
		// for (int i = 0; i < a.length; i++) {
		// 	if (max < a[i]) {
		// 		max = a[i];
		// 	}
		// }
		// System.out.println("The max value of the array : " + max);

		// System.out.println("For minimum number finding ......");
		// int min = a[0];
		// for (int i = 0; i < a.length; i++) {
		// 	if (min > a[i]) {
		// 		min = a[i];
		// 	}
		// }
		// System.out.println("The min value of the array : " + min);

		// System.out.println("For maximum number finding ......");

		int smax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				smax = max;
				max = a[i];
			}
		}
		System.out.println("The smax value of the array : " + max);
		System.out.println("The smax value of the array : " + smax);

	}

}
