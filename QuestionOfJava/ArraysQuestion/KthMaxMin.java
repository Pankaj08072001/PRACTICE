package QuestionOfJava.ArraysQuestion;
import java.util.Arrays;

public class KthMaxMin {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
		Arrays.sort(arr);
        int k = 4;
		int b = arr.length;
		int KthMax = b-3;
        System.out.println("Kth smallest element is " +arr[k]);
		System.out.println("Kth highest element is " +arr[KthMax]);


		// Optional<Integer> kthSmallest = Arrays.stream(arr)
   		// 	 .boxed()
   		// 	 .sorted()
		// 	.skip(k - 1)
   		// 	 .findFirst();
		// 	 System.out.println(kthSmallest);
	}
}
