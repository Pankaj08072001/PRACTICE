package QuestionOfJava.ArraysQuestion;

import java.util.Arrays;

public class Sort0and1 {
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp1 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp1;
                    mid++;
                    low++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0, 1, 0, 2, 1, 0, 2 };
        sort012(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
