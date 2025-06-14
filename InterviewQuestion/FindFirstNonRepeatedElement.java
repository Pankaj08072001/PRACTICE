package InterviewQuestion;

public class FindFirstNonRepeatedElement {

	public static void main(String[] args) {
		int brr [] = {9,4,9,6,7,4};
		int result =FindFirstNonRepeatedElement.main1(brr);
		System.out.println(result);
	}
	public static int main1(int [] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			boolean isRepeated = false;

			for (int j = 0; j < arr.length; j++) {
				if(i != j && arr[i]==arr[j]){
					isRepeated = true;
					//System.out.println( "I is "+arr[i] + " J is "+arr[j]);
					break;
				}
			}
			if(!isRepeated){
				//System.out.println(arr[i]);
				return arr[i];
			}
		}
		return 0;
	}
}
