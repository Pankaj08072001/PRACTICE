package BasicOfjava;

public class TOddRounder {
	static int oddRounder(int n ){
		if(n < 0)
		   return -1;
		else if(n==0)
		   return -2;   
		else if (n % 2 ==0) 
		return n;
		else 
		  return (n + (10- n%10));
	}
	public static void main(String[] args) {
		System.out.println(oddRounder(10));
		System.out.println(oddRounder(-5));
		System.out.println(oddRounder(23));
		System.out.println(oddRounder(0));
	}
}
