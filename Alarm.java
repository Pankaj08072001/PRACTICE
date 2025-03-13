/*
Define a method which accepts two value as arguments (an integer and boolean) and return the string indicating when the alarm should ring. The first argument indicating day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation or not.
Write the method with the following specifications: 
Name of method ringAlarm() // which accepts two arguments, first indicating day of the week and second a boolean indiacting if we are on vacation.
Arguments: two arguments of type integer and boolean
Return Type: an string value 
Specifications: The value returned by the method ringAlarm() is determined by the following rules:
If the first argument value is not between 0 to 6, return "Invalid Inputs"
If the second value is not boolean value true or false, return "Invalid Inputs"
If the first argument value is between 1 to 5 indicating the week day's and second value is true indicating on vacation, return "10:00"
If the first argument value is between 1 to 5 indicating the week day's and second value is false indicating not on vacation, return "07:00"
If the first argument value is 0 or 6 indicating the weekend day's and second value is true indicating on vacation, return "OFF"
If the first argument value is 0 or 6 indicating the weekend day's and second value is false indicating not on vacation, return "10:00"
*/

public class Alarm {
    public static String ringAlarm(int day, boolean onVacation) {
        // Check if day is within valid range
        if (day < 0 || day > 6) {
            return "Invalid Inputs";
        }

        // Check if onVacation is a boolean value (this check is implicit in Java)
        
        // Determine alarm time based on day and vacation status
        if (day >= 1 && day <= 5) { // Weekdays (Mon-Fri)
            return onVacation ? "10:00" : "07:00";

        } 
		else if (day == 0 || day == 6) { // Weekends (Sun-Sat)
            return onVacation ? "OFF" : "10:00";
        }

        // Fallback return (should never reach here due to previous checks)
        return "Invalid Inputs";
    }

    public static void main(String[] args) {
        System.out.println(ringAlarm(1, false)); // Output: "07:00"
        System.out.println(ringAlarm(0, true));  // Output: "OFF"
        System.out.println(ringAlarm(5, true));  // Output: "10:00"
        System.out.println(ringAlarm(7, false)); // Output: "Invalid Inputs"
        System.out.println(ringAlarm(3, true));  // Output: "10:00"
    }
}
