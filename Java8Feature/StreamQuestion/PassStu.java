package Java8Feature.StreamQuestion;

import java.util.Arrays;
import java.util.List;

public class PassStu {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(35,28,85,75,96,74,26);
		List<Integer> Plist = list.stream().filter(n-> n > 33).toList();
		System.out.println(Plist);
		List<Integer> Glist = list.stream().filter(n-> n < 33).map(j-> j+5).toList();
		System.out.println(Glist);

	}
}
