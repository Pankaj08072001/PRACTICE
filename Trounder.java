/*
Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, then round off it's value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 
Write the method with the following specifications: 
Name of method sumOfRoundedValues() // which accepts three integer value as argument and return the sum of three rounded numbers.
Arguments: three argument of type integer
Return Type: an integer value 
Example
If a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
If a = 23, b = 37, c = 55
   20 + 40 + 60 = 120
Specifications: The value returned by the method sumOfRoundedValues() is determined by the following rules:
If any of the given number is negative or zero, return -1.
If any of the given numbers right most digit is of the number is lessthan 5, then round off its value to the previous multiple of 10 otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 
*/

class Trounder{
   public static int roundOfTen(int num){
	if (num % 10 == 0)
	    return num;
	else if (num % 10 < 5) {                  
      	   return (num - (num % 10));
	
	}
	else 
	  return num + (10 - (num % 10));
	 
   }
   public static int sumOfRoundedValues(int x , int y , int z ){
	if(x <= 0 || y <= 0 || z <= 0)
	   return -1;
	else {
        int p = roundOfTen(x);
        int q = roundOfTen(y);
	int r = roundOfTen(z);

	return p + q+ r;
	}
  }

  public static void main(String args[]){
    System.out.println("Number is lessthan 5: = " +sumOfRoundedValues(23, 34 , 66)); // 70+30+20 = 120
    System.out.println("Number is greater or equal to 5: = " +sumOfRoundedValues(23, 37 , 55)); // 20+40+40 = 100
    System.out.println("Number is negative or zero : = "+ sumOfRoundedValues(-15 ,23,66));  // -1
  }
}