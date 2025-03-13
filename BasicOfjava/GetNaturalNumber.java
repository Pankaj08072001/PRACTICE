package BasicOfjava;

public class GetNaturalNumber {

	public static String Number(int num1 ,int  num2){
		if(num1 <= 0  || num2<=0)
		return (num1 <= 0  || num2<=0) ? "-1" :"-2";
		else if(num1 >= num2)
		return " ";
		else
		return num1 + "  " + Number(num1+1 , num2) ;
	}
	public static void main(String[] args) {
		System.out.println(Number(5, 10));
		System.out.println(Number(0, 10));
		System.out.println(Number(15, 10));
		
	}
}
