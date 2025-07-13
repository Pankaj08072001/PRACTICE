package QuestionOfJava.StringsQuestion;

public class StringCompossion{
	public static void main(String[] args) {
		String str = "aaaaabbbbcccccddddeee";
		String str1= "";
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)){
				count++;
			}
			else{
				str1 += str.charAt(i-1) + String.valueOf(count);
				count = 1;
			}
		}
		str1 += str.charAt(str.length()-1) +  String.valueOf(count);
		System.out.println(str1);
	}
}