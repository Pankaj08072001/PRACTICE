package Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 5, 10, 22, 56, 74, 85, 96, 8, 5, 42, 4, 5, 4);
	List<Integer> filterlist = list.stream() 	// change the list in sream
		.filter(n -> n % 2 == 0) 				// for condition as a function
		.map(x -> x / 2) 						// for map condition
		.distinct() 							// for remove dupicate
		.sorted((a, b) -> b - a) 				// for customized sorted order
		.skip(3) 								// skip front value
		.toList(); 								// collect the data in the form of list
		System.out.println(filterlist);
// --------------------------------------------------------------------------------------------------
	List<Integer> collect = Stream
	    .iterate(0, n -> n + 1) 			// For Iterate perpose
		.limit(101) 					// set the maxmium limit
		.filter(x -> x % 2 == 0) 				// for Conditions
		.skip(1) 								// skip the value for given value in skip function
		.toList(); 								// Collect all the data
		 System.out.println(collect);
// -----------------------------------------------------------------------------------------------
	List<Integer> collects = Stream
	    .iterate(0, n -> n + 1) 			// For Iterate perpose
		.limit(101) 					// set the maxmium limit
		.map(x -> x / 20) 						// for Conditions
		.distinct() 							// For Removing dupicate
		.sorted((a, b) -> b - a) 				// costom sorting order
		.skip(1) 								// skip the value for given value in skip function
		.toList(); 								// Collect all the data
		System.out.println(collects);

// -----------------------------------------------------------------------------------------------------
	Integer Temp = Stream
		.iterate(0, n -> n + 1)   			// For Iterate perpose
		.limit(101)                     // set the maxmium limit
		.map(x -> x / 20) 						// for Conditions
		.distinct()								// dupicate remove
		.peek(System.out:: println)				// Print the all value 
		.max((a, b) -> a - b) 					// costom sorting order
		.get();							        // max value 
		System.out.println(Temp);               
	}
}
