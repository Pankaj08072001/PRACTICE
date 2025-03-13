/*
Define a method which accepts three boolean value as arguments and return true if any of the two values are true, otherwise return false.
Write the method with the following specifications: 
Name of method countBoolean() // which accepts three boolean arguments, return true if any of the two values are true, else return false.
Arguments: two arguments of type boolean
Return Type: a boolean value 
Specifications: The value returned by the method countBoolean() is determined by the following rules:
If b1 = true, b2 = true, b3 = true then, return true
If b1 = true, b2 = true, b3 = false then, return true
If b1 = true, b2 = false, b3 = false then, return false
If b1 = false, b2 = false, b3 = false then, return false

*/

class Count {
 static String countBoolean(boolean b1, boolean b2, boolean b3){
	if ((b1 == true && b2 == true))
	return "true";

	else if ((b1 == true && b3 == true))
	return "true";
	
	else
	return "false";

  }  
public static void main(String args[]){
System.out.println(countBoolean(true , true, true));
System.out.println(countBoolean(true , true, false));
System.out.println(countBoolean(true , false, false));
System.out.println(countBoolean(false , false, false));

}

}