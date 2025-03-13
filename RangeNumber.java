/*Define a method which returns a String containing natural numbers between ranges of two numbers separated by a single space.
Write the method with the following specifications:
Name of method: getNumbersInRange()
Arguments: 2 Arguments of int type 
Return Type: A String value
Values must not be negative. If yes, then return -1 as string.                      
Values must not be same. If yes, then return -2 as string.                         
1st arguments value must not be greater than 2nd arguments value. If yes, then return -3 as string.
Exclude the first and last value and return the result as one string with every value separated by single blank space.
*/

class RangeNumber{
    public class NumberRange {

    public static String getNumbersInRange(int start, int end) {
        // Check for negative values
        if (start < 0 || end < 0) {
            return "-1";
        }
        
        // Check if the values are the same
        if (start == end) {
            return "-2";
        }
        
        // Check if the first value is greater than the second
        if (start > end) {
            return "-3";
        }
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Loop through the range excluding the first and last values
        for (int i = start + 1; i < end; i++) {
            result.append(i).append(" ");
        }
        
        // If the result is empty, return an empty string
        if (result.length() == 0) {
            return "";
        }
        
        // Remove the trailing space and return the result as a string
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(getNumbersInRange(3, 7));  // "4 5 6"
        System.out.println(getNumbersInRange(1, 5));  // "2 3 4"
        System.out.println(getNumbersInRange(1, 1));  // "-2"
        System.out.println(getNumbersInRange(-3, 5)); // "-1"
        System.out.println(getNumbersInRange(7, 3));  // "-3"
        System.out.println(getNumbersInRange(5, 5));  // "-2"
    }
}
}
