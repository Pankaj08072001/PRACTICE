package Java8Feature.StreamQuestion;
import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		 int arr[]={1,8,3,4,5,9};
		 int sum =0;
		 for(int i = 0; i <arr.length-1; i++){
			if(arr[i] % 2 ==0){
				sum+=arr[i];
			}
		 }
		 System.out.println(sum);

		int sum2 = Arrays.stream(arr).filter(n -> n % 2==0).sum();
		System.out.println(sum2);
		
		//List <String> list = Arrays.asList("Apple ", "Banana ","Chery");
	    //Stream <String> mystream = list.stream();

		//String[] array = {"Apple ", "Banana ","Chery"};
		//Stream <String> mystream1 = Arrays.stream(array);

		//Stream <Integer > limit =Stream.of(1,2,3);

		//Stream <Integer> limit1 = Stream.iterate(0 , n-> n+1).limit(100);

		//Stream<Integer> limited = Stream.generate(()->(int)Math.random()*100).limit(100);
		
	}
}
