package Java8Feature;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(LocalDate.of(2000, 8, 7));
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		System.out.println(date.lengthOfYear());
		// System.out.println(date.atTime(date));
		Month s = Month.valueOf("May");
		System.out.println(s);

		LocalTime l = LocalTime.now();
		System.out.println(l);
		System.out.println(LocalTime.of(2, 53));
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.class);
		System.out.println(LocalTime.ofNanoOfDay(5));

		DateTimeFormatter now = DateTimeFormatter.BASIC_ISO_DATE;
		DateTimeFormatter.ofPattern(null, null);
		now.getClass();
	}
}