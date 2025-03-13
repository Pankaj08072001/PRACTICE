package ArrayQuestion;

import java.util.Scanner;

public class CountVowalAndCons {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
        String inputText = sc.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;

		inputText = inputText.toLowerCase();

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                vowelCount++;
            }
            else if ((ch >= 'a' && ch <= 'z')) {
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount + "\n" + "Consonants: " + consonantCount);
        sc.close();
    }
}
