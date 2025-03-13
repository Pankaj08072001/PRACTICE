/*
Define a method which returns the string as "Even" if the given number is an even number, return "Odd" if the given number is an odd number, return string as "Invalid Input" if the given number is lessthan or equal to 0.
Write the method with the following specifications: 
Name of method: isEvenOrOdd() // which accepts an integer value as argument.
Arguments: one argument of type integer
Return Type: a String value (Even/Odd/Invalid Input) 
Specifications: The value returned by the method isEvenOrOdd() is determined by the following rules:
If the given number is negative or zero, return "Invalid Input"
If the given number is even, return "Even"
If the given number is odd, return "Odd"
*/
class EvenOdd{
String isEvenOrOdd(int n ){
  if(n <=0)
    return "Invaild Input";

  else if (n % 2==0)
    return "Even";

  else 
   return "Odd";

}
public static void main(String args []){
EvenOdd e = new EvenOdd();
System.out.println(e.isEvenOrOdd(24));
System.out.println(e.isEvenOrOdd(25));
System.out.println(e.isEvenOrOdd(0));
System.out.println(e.isEvenOrOdd(-50));
}
}