package BasicOfjava;
class EvenOdd {
   
	public static void main(String[] args) {
		int arr[] = {10,15,26,13,85,75,98,157,8,465,25,42};
		int min=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] < min ){
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	
}