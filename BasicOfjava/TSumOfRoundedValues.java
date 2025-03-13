package BasicOfjava;

public class TSumOfRoundedValues {
	static int roundNum(int num ){
		if (num % 10 == 0)
		return num;
		else if (num % 10 < 5)
			return num -(num%10);
		else if (num % 10 >= 5) 
		    return num + (10- num%10);
		else
		return 0;
	}
	static int sumOfRoundedValues(int num1, int num2, int num3){
		if (num1 <= 0 || num2<= 0 || num3<=0)
		return -1;
		else{
		int p = roundNum(num1);
		int q = roundNum(num2);
		int r = roundNum(num3);
		return p+q+r;
		}
	}
	public static void main(String[] args) {
		System.out.println(sumOfRoundedValues(23, 34, 66));
		System.out.println(sumOfRoundedValues(23, 37, 55));

	}
}
