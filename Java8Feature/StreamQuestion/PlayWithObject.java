package Java8Feature.StreamQuestion;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class PlayWithObject {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		Date joiningDateRam = date.parse("01-01-2000");
		Date joiningDatesita = date.parse("12-08-1992");
		Date joiningDatepankaj = date.parse("23-04-2001");
		Date joiningDateRaman = date.parse("31-01-2004");
		Date joiningDatesuraj = date.parse("21-11-2008");

		

		List <Emp> emp = 
		Arrays.asList(
		(new Emp("Ram", 50000,  joiningDateRam, "M")),
		(new Emp("sita", 10000, joiningDatesita, "F")),
		(new Emp("pankaj", 200000, joiningDatepankaj, "M")),
		(new Emp("Raman", 15000, joiningDateRaman, "M")),
		(new Emp("suraj", 20000, joiningDatesuraj, "M"))
		);

	//    Emp maxsallery = emp.stream().max(Comparator.comparingDouble(Emp::getSallery)).get();
	// 	System.out.println(maxsallery);

	// Emp maxsallery = emp.stream().sorted((a,b)-> Double.compare(b.getSallery(), a.getSallery())).skip(1).findFirst().get();
	// System.out.println(maxsallery);

	 Optional <Emp> maxsallery = emp.stream().min(Comparator.comparing(Emp::getJoiningDate));
	 maxsallery.ifPresent(System.out::println);
	//System.out.println(maxsallery);


	Map <String ,Long> Count = emp.stream().collect(Collectors.groupingBy(Emp::getGender , Collectors.counting()));
	System.out.println(Count);

	}
	
}
