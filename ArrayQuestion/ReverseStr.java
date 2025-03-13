package ArrayQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStr {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your String : ");
		String Nstr = br.readLine();
		String str = "";
		int num = Nstr.length()-1;
		for (int i = 0; i < Nstr.length(); i++) {
			str = str + Nstr.charAt(num - i);
		}
		// for(int i =Nstr.length()-1; i >= 0; i--){
		// str = str + Nstr.charAt(i);
		// }
		System.out.println(str);
	}
}
