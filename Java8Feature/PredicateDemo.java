package Java8Feature;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
	public static void main(String[] args) {
		// Boolean valued function is called predicate 
		List<Integer> numbers = Arrays.asList(5,6,7,8,6,6,4,1,2,3,6,4,4,36,6,1,5,7);
		int sum = numbers.stream().filter(x -> x<5).mapToInt(x -> x).sum();
		System.out.println(sum);
		Predicate <Integer> salleryGreaterThanOneLac = x -> x>100000;
		Function <Integer , Integer> function = x -> x*x;
		//Consumer <Integer> consumer = x -> System.out.println(x);
		Supplier <Integer> supplier = ()-> 100;
		System.out.println(function.apply(10));
		// System.out.println(consumer.accept(10));
		System.out.println(supplier.get());
		System.out.println(salleryGreaterThanOneLac.test(100000000));
	}
		 
}
