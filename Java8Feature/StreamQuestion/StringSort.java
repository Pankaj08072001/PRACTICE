package Java8Feature.StreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSort {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Pankaj" , "Raman" , "Suraj" , "Aman" ,"Sonak");
		Comparator<String> c = (a,b)-> {
		int l1 = a.length();
		int l2 = b.length();

		return Integer.compare(l2, l1);
	}; 
	  // String st = list.stream().min(c).get();
	   String st = list.stream().max(c).get();
       System.out.println(st);
	   list.stream().forEach(System.out::println);

	}
}
