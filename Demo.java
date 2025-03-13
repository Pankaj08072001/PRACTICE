import java.util.Arrays;
import java.util.Scanner;
class Shorted 
{
public static void main(String args[])
{
try (Scanner sc = new Scanner(System.in)) {
	System.out.print("Enter Size of array :");
	int size = sc.nextInt();
	int a [] = new int[size];
	for (int i = 0; i < size; i++){
	a[i] = sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	System.out.print("Enter the number u want occurance  :");
	int b = sc.nextInt();
	int occ = 0;
	for (int i = 0; i < size; i++){
	if (a[i]== b){
	occ++;
	}
	}
	System.out.println("Occurance is " + b + " is = " +occ);
}

}
}