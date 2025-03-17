package Exceptiontry;

class DivideByZeroException extends RuntimeException {
	public DivideByZeroException(String m) {
		super(m);
	}
}

public class Custom {
	public static void divide(int a, int b) {
		if (b == 5) {
			throw new DivideByZeroException("Division by zero is not allowed.");
		}
		System.out.println("Result: " + (a / b));
	}

	public static void main(String[] args) {
		try {
			divide(10, 5);
		} catch (DivideByZeroException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}
