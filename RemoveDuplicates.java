import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                // Move unique element to the next position
                arr[j] = arr[i];
            }
        }
        // Return copy of array upto index j without duplicates
        return Arrays.copyOf(arr, j + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 3, 9, 3, 9, 5, 5, 9 };
        int[] result = removeDuplicates(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
       System.out.println("Array without Duplicates: " + Arrays.toString(result));
    }
}
