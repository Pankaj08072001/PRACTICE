package InterviewQuestion;

public class FindImg {
    public static void main(String[] args) {

        int arr1[] = { 3, 4, 5, 6, 7 };
        int arr2[] = { 7, 6, 2, 4, 3 };

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }

        int sum1 = 0, sum2 = 0;
        int product1 = 1, product2 = 1;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];

            product1 *= arr1[i];
            product2 *= arr2[i];
        }

        if (sum1 == sum2 && product1 == product2) {
            System.out.println("Arrays are equal (likely)");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

}

// String s1 = "java001Developer002";
// String digit ="";

// for (int i = 0; i < s1.length(); i++) {
// char ch = s1.charAt(i);
// if(Character.isDigit(ch)){
// digit += ch;
// }
// }
// System.out.println(digit);