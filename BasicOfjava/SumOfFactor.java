package BasicOfjava;

public class SumOfFactor {
	public static void main(String[] args) {
		int num = 28;
		int result=0;
		int i =1; 
		while(i <= num ){
			if(num % i ==0)
			 result += i;
			i++;
		}	
		System.out.println("Sum of the factor is : "+result);	
	}
	
}
