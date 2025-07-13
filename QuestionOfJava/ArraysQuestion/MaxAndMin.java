package QuestionOfJava.ArraysQuestion;

public class MaxAndMin {
	public static void main(String[] args) {
		int arr[] = { 10, 180, 20, 48, 69, 75, 84, 35, 5, 28, 33, 240,12 ,520};
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
