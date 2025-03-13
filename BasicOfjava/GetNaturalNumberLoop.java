package BasicOfjava;

public class GetNaturalNumberLoop {
	public static String  Loop(int num1 , int num2){
		if(num1 <= 0  || num2<=0)
		return (num1 <= 0  || num2<=0) ? "-1" :"-2";
		else if(num1 >= num2)
		return "-3";
		for(int i =num1; i< num2; i ++){
			num1 += 1;
			System.out.print(num1+" ");
		}
		
		return "\t" ;
	}
	public static void main(String[] args) {
		System.out.println(Loop(5, 100));
		System.out.println(Loop(50, -1));
		
	}
}
