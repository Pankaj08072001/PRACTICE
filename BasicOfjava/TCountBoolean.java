package BasicOfjava;

public class TCountBoolean {
	static boolean countBoolean(boolean b1 , boolean b2 , boolean b3){
		if ( (b1 == true && b2 == true) || (b1 == true && b3 == true))
		return true;

		else 
			return false;
	}
	public static void main(String[] args) {
		System.out.println(countBoolean(true, true, true));
		System.out.println(countBoolean(true, true, false));
		System.out.println(countBoolean(true, false, false));
		System.out.println(countBoolean(false, false, false));
		
	}
}
