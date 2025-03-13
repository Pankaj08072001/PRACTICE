package BasicOfjava;

public class SqCalculate {
	static int calculater(int num){
		if(num <=0)
		return 0;
		else if ( num %2 == 0) 
		return num*num;

		return num*num*num;
	}
	public static void main(String[] args) {
		System.out.println("Invalid Input please Enter the right number is :"+calculater(0));
		System.out.println("Odd number is :"+calculater(5));
		System.out.println("Even number is :"+calculater(4));
	}
}
