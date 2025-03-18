package Pankaj;
import java.util.Arrays;

public class Test {
	
    public static int[] removeDuplicates(int[] a) {
        int j =0;
        for(int i=0; i<a.length-1; i++){
            if(a[i] != a[j]){
                j++;
              a[j] = a[i];   
            }
            
        }
        return Arrays.copyOf(a, j+1);
    }
    public static void main(String args []){
        int a[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(Arrays.toString(removeDuplicates(a)));
        
    }
}
