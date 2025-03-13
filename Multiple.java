/*
Define a method which returns the sum of three numbers after rounding off each number to the next multiple of 10. If any of the given number is multiple of 10 dont change it's value
Write the method with the following specifications: 
Name of method: sumOfMultiples() // which accepts three integer value as argument and return the sum of three numbers after rounding off each number to the next multiple of 10. 
Arguments: three argument of type integer
Return Type: an integer value 
Example
If a = 23, b = 34, c = 69
   30 + 40 + 70 = 140
If a = 23, b = 34, c = 50
   30 + 40 + 50 = 120
Specifications: The value returned by the method sumOfMultiples() is determined by the following rules:
If any of the given number is negative or zero, return -1.
*/

class Multiple {
public static int roundOfTen(int num){
    if (num % 10 == 0) {
     return num;
    }
    else {	        
    return num + (10 - (num % 10));  
    }
}


public static int sumOfMultiples(int n , int n1 , int n2){

if (n <= 0 || n1 <= 0  || n2 <= 0){
   return -1;
}

else{
     int a = roundOfTen(n);
     int b = roundOfTen(n1);
     int c = roundOfTen(n2);

     return a+b+c;
   }
}

    public static void main(String args[]){
    System.out.println(sumOfMultiples(23,34,69));  // 140
    System.out.println(sumOfMultiples(23,34,50));  // 120
    System.out.println(sumOfMultiples(12,31,-21)); // -1

    }
}