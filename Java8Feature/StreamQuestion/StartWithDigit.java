package Java8Feature.StreamQuestion;

import java.util.Arrays;

public class StartWithDigit {
		public static void main(String[] args) {
			Integer [] arr = {10,15,8,49,25,98,32,18,16};
			Arrays.asList(arr)
			.stream()
			.filter(n -> n.toString().startsWith("1"))
			.forEach(System.out::println);
			

	}
}
