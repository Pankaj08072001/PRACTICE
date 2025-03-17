package Java8Feature.StreamQuestion;

import java.util.Arrays;
import java.util.List;

public class GetCount {
	public static void main(String[] args) {
	List <Integer> li = Arrays.asList(10,8,11,9,6,14,12,20,30,15,25,35);
	
	long  lis = li.stream().filter(n-> n>33).count();
	System.out.println(lis);


	// List <Integer> st = li.stream().sorted().toList();
	// System.out.println(st);	

	// List <Integer> st = li.stream().sorted((a,b)-> b-a).toList();
	// System.out.println(st);	

	}
}
