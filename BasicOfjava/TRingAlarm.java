package BasicOfjava;

public class TRingAlarm {
	static String ringAlarm(int day , boolean onVacation){
        if (day < 0 || day > 6) {
            return "Invalid Inputs";
        }

        if (day >= 1 && day <= 5) { // Weekdays (Mon-Fri)
            return onVacation ? "10:00" : "07:00";

        } 
		else if (day == 0 || day == 6) { // Weekends (Sun-Sat)
            return onVacation ? "OFF" : "10:00";
        }
		return "  0";
	}
public static void main(String[] args) {
		System.out.println(ringAlarm(5, true));
		System.out.println(ringAlarm(6, false));
		System.out.println(ringAlarm(0, true));
		System.out.println(ringAlarm(5, false));


	
}
	
}