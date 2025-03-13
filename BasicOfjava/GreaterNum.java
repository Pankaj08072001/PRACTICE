package BasicOfjava;
public class GreaterNum {
	static int getGreatest(int m , int n){
		if(n==0 || m==0)
		    return -2;
		else if (n < 0 || m < 0)
			return -1;
		else if (n > m)
			return n;
		else if(m > n)
			return m;

	   return 0;		
	}
	public static void main(String[] args) {
		System.out.println(getGreatest(5,2));
		System.out.println(getGreatest(0 ,5));
		System.out.println(getGreatest(-10,8));
	}
}
