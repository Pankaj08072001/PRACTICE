/*
Define a method which returns a String containing natural numbers between a range of two numbers separated by a single space. Solve it without using loops.
Write the method with the following specifications:
Name of method: getNaturalNumbers()
Arguments: 2 Arguments of int type. 

Return Type: A String value
Values must not be negative. If yes, then return -1 as string.                                
Values must not be 0. If yes, then return -2 as string. 
Natural Numbers must be returned as one string with every value separated by single blank space.
Consider that, the first argument value is less than the second argument number
*/

class Numbers{
static String getNaturalNumbers(int n , int m ){	
if (n < 0 || m < 0)
return "-1";

else if (n ==0 || m == 0)
return "-2";

else {
if (n > m) {
return ""; // Base case for invalid range
}
return n + (n < m ? " " + getNaturalNumbers(n + 1, m) : "");
}
}


public static void main (String args[]){
System.out.println(getNaturalNumbers(0 , 20));
System.out.println(getNaturalNumbers(-2, 20));
System.out.println(getNaturalNumbers(5, 20));

}

}