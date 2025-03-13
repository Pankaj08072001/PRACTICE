package BasicOfjava;

public class FindRanger {
	public static String getNumbersInRange(int end, int start) {
		if (end < 0 || start < 0)
			return "-1";
		if (end == start)
			return "-2";
		if (end < start)
			return "-3";
		if (end - start==1)
		 	return "-4";
			for(int i = end-1 ; i > start; i--)	{
				end--;
				System.out.print(end +" ");	
			}	
		return "  ";
	}

	public static void main(String[] args) {
		System.out.println(getNumbersInRange(10, 1));
		System.out.println(getNumbersInRange(3, 0));
		System.out.println(getNumbersInRange(3, 2));
	}

}
