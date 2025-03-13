package BasicOfjava;
class EvenOdd {
    static int isEven(int n){
		if(n%2==0){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(isEven(11));

	}
	
}