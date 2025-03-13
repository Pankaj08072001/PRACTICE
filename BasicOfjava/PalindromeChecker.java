package BasicOfjava;

public class PalindromeChecker {

    public static String checkPalindrome(int num) {
        if (num < 0) {
            return "-1";
        }

        if (num >= 0 && num <= 9) {
            return "-2";
        }

        String numStr = Integer.toString(num);
        String reversed = new StringBuilder(numStr).reverse().toString();

        if (numStr.equals(reversed))
            return "true";
        else 
            return "false";

    }

    public static void main(String[] args) {
        // Test the checkPalindrome method
        System.out.println(checkPalindrome(121)); // Output: -1
        System.out.println(checkPalindrome(5)); // Output: -2
        System.out.println(checkPalindrome(121)); // Output: true
        System.out.println(checkPalindrome(123)); // Output: false
    }
}
