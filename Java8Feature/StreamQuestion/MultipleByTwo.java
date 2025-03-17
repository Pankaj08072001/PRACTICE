package Java8Feature.StreamQuestion;

import java.util.Arrays;
import java.util.List;

public class MultipleByTwo {
	public static void main(String[] args) {
	List <Integer> list = Arrays.asList(10,9,8,7,45,6,22);
	List <Integer> list1 = list.stream().map(n -> n*2).toList();
	System.out.println(list1);
	}
}
