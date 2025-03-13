/* Program-1
Define a method which returns the 1 if the given number is even, in other case return 0
Name of method: isEven() // which accepts an integer value as argument and return 1 if the given number is even, else retrun 0.
Argument: int
Return type: an integer value 
Example, if x = 22, return 1. if x = 35, return 0
*/ 


public class CheakNum{
int isEven(int num){
if (num % 2 ==0 )
return 1;

return 0;
}

public static void main(String [] args){
CheakNum e = new CheakNum();
System.out.println(e.isEven(35));
System.out.println(e.isEven(22));

}
}