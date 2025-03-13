public class SBSSB {
	public static void main(String[] args) {
		// StringBuffer sb = new StringBuffer(1000);
		// sb.append("pankaj  chaudhary");
		// sb.trimToSize();
		// System.out.println(sb.capacity());
		// System.out.println(sb.reverse());
		String s = "Pankaj";
		String Temp = "";
		for(int i = 0;  i <s.length(); i++){
			System.out.println(s.charAt(i) );
			Temp = s.charAt(i) + Temp;
		}
		System.out.println(Temp);

	}
}