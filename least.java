/*
Define a method which returns the least number among two numbers.
Write the method with the following specifications: 
Name of method: getLeastNum() // which accepts two integer values as argument and return the least value.
Arguments: two argument of type integer
Return type: an integer value 
Specifications: The value returned by the method getLeastNum() is determined by the following rules:
If any of the given numbers are negative, return -1.
If any of the given numbers are zero, return -2.
If the given numbers are positive, return the least number.
*/

public class least{
int getLeastNum(int x , int y ){
if (x<0 || y < 0){
return -1;
}
else if (x == 0 || y == 0){
return -2;
}
else if (x < y ){
return x;
}
else {
return y;
}
}
public static void main(String args[]){
least l = new least();
System.out.println(l.getLeastNum(100,400)); // least 
System.out.println(l.getLeastNum(-100,400)); // -1
System.out.println(l.getLeastNum(0,400));    //-2

}
}