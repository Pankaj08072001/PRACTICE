/* 
Define a method which returns the square of the given number if it is an even, return cube of the given number if it is an odd number.
Write the method with the following specifications: 
Name of method: calculate() // which accepts an integer value as argument and return square of the given value if it is an even, return cube of the given value if it is an odd number.
Arguments: one argument of type integer
Return Type: an integer value 
Specifications: The value returned by the method calculates () is determined by the following rules:
If the given number is negative or zero, return -1.
If the given number is even, return square of the number.
If the given number is odd, return cube of the given number.
*/
public class Square{
int calculate(int n) {

if (n<=0)
 return -1;

else if (n % 2 == 0)
 return (n*n);

else 
 return (n*n*n);

}

public static void main(String args[]){
     Square s = new Square();
     System.out.println(s.calculate(4));
     System.out.println(s.calculate(0));
     System.out.println(s.calculate(-1));
     System.out.println(s.calculate(5));
     }
}