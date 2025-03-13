package ArrayQuestion;

import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) {
	int number = 190; 
	BigInteger factorial = factorial(number);
	System.out.println("Factorial of " + number + " is: " + factorial);
	}
	
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE; 
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i)); 
        }
        return result;
    }
}
