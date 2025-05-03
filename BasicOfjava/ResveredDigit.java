package BasicOfjava;
public class ResveredDigit {
	public static void main(String[] args) {
		// int n = 15362;
		// int temp = n;
		// int res=0 , r;

		// while (n != 0) {
		// 	r = n %10;
		// 	res = res* 10 + r;
		// 	n/=10;
		// }
		// System.out.println(res);

		String s = "pankaj";
		String temp = " ";
		//  for (int i = 0; i < s.length(); i++) {
		// 	temp = s.charAt(i) + temp ;
		//  }
		//  System.out.println(temp);

		for (int i = s.length()-1; i >= 0; i--) {
			temp += s.charAt(i) ;
		 }
		 System.out.println(temp);
		
	}
}
