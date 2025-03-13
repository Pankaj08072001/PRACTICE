package BasicOfjava;

public class TSumOfMultiples {
	static int round(int n ){
		if (n % 10 ==0 ) {
			return n;
		}
       return n + (10-n%10);
	}
	static int sumOfMultiples(int num , int num2, int num3){
		if(num <=0 || num2 <=0 || num3 <= 0)
		return -1;
		else{
		int p = round(num3);
		int q = round(num2);
		int r = round(num);
		return p+q+r;
		}
	}
	public static void main(String[] args) {
		System.out.println(sumOfMultiples(-10, 15, 18));
	}
}
