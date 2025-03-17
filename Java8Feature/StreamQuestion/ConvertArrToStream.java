package Java8Feature.StreamQuestion;

import java.util.Arrays;

public class ConvertArrToStream {
	public static void main(String[] args) {
		Integer [] arr = {10,90,80,35,55,36};
		Arrays.stream(arr).filter(i->i%2==0).forEach(System.out::println);
	}
}
