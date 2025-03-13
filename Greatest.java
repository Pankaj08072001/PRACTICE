/* Define a method which returns the greatest number among two numbers.
   Write the method with the following specifications: 
   Name of method: getGreatest() // which accepts two integer values as argument and return the greatest value.
   Arguments: two argument of type integer
   Return type: an integer value 
   Specifications: The value returned by the method getGreatest() is determined by the following rules:
   If any of the given numbers are negative, return -1.
   If any of the given numbers are zero, return -2.
   If the given numbers are positive, return the greatest.
*/
public class Greatest{
int getGreatest(int x , int y ){
if (x < 0 || y < 0){
return -1;
}
else if (x == 0  || y == 0 ){
return -2;
}
else if (x > y){
 return x;
}
else{
return y;
}
}
public static void main(String args[]){
Greatest g = new Greatest();
System.out.println(g.getGreatest(8,5));  // greatest 
System.out.println(g.getGreatest(-8,5)); // -1
System.out.println(g.getGreatest(0,5));  // -2
}
}