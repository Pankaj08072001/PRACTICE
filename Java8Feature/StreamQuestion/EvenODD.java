package Java8Feature.StreamQuestion;

import java.util.Arrays;
import java.util.List;

public class EvenODD {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5,8,10,12,14,17,13);
		List <Integer> filterList = list.stream().filter(n -> n%2==0).toList();
		System.out.println(filterList);
	}
}
