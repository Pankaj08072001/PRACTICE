package QuestionOfJava.ArraysQuestion;

public class Pattern {
	public static void main(String[] args) {
		// int num = 65486;
		// System.out.println(num);
		// int temp=0;
		// while (num > 0) {
		// temp = temp *10 + num%10;
		// num /= 10;
		// }
		// System.out.println(temp);

		// String str = "pankaj76364";
		// String empt = "";
		// for (int i = str.length()-1; i >= 0; i--) {

		// empt += str.charAt(i);
		// }
		// System.out.println(empt);

		// String str = "pankaj76364";
		// String digits = "";
		// String letters = "";
		// for (int i = 0; i < str.length(); i++) {
		// 	char ch = str.charAt(i);
		// 	if (Character.isDigit(ch)) {
		// 		digits += ch;
		// 	} else if (Character.isLetter(ch)) {
		// 		letters += ch;
		// 	}
		// }
		// System.out.println(digits);
		// System.out.println(letters);

		// int arr [] = new int [5];
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.println(arr[i]);
		// }
		//  ouput is 0 ; 


		// int abc =0;
		// int a_bc=10;
		// int _a_ = 5;
		// int b$b = 12;
		// int $pnkj = 2;
		// int _pnkj1=4;

		// int 2pankaj; invalid 
		// int @a = 10;  int valid 
	    // "abc dc" = 10;
		// System.out.println(abc);
		// System.out.println(a_bc);
		// System.out.println(_a_);
		// System.out.println(b$b);
		// System.out.println($pnkj);	
		// System.out.println(_pnkj1);

		outer:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == 1)
            continue outer;
        System.out.println(i + " " + j);
    }
}


	}
}
