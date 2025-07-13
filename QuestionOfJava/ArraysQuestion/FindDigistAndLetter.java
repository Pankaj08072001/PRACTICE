package QuestionOfJava.ArraysQuestion;

public class FindDigistAndLetter {
	public static void main(String[] args) {
		// String s1 = "pankaj Chaudhary how Are You !";
		// //String[] temp = s1.split(" ");
		// CharSequence s2 = s1.substring(9, 15);
		
		// // for (String string : temp) {
			// // 	System.out.println(string);
			// // }
			// System.out.println(s2);

		String s1 ="Pan12k23Aj";	
			String digit = "";
			String letter ="";
			for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(Character.isDigit(ch) ){
				digit += ch;
			}else {
				letter += ch;
			}
		}
		System.out.println(digit);
		System.out.println(letter);
	}
}
