package ArrayQuestion;

import java.util.Arrays;

public class Ocurrance {

    public static void main(String[] args) {
        int arr[] = { -2, 0, 1, 8, -2, 8, 1, 0, -2, 1, 0, 5, 5, 6, 6,2,2 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println("Occurrance of  "+arr[i]+" = " + count);

        }

    }
}
