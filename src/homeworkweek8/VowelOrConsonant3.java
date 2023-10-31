package homeworkweek8;

import java.util.Scanner;

/**
 *  Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class VowelOrConsonant3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.next();

        scanner.close();

        char character = input.charAt(0);
        if (input.length() != 1 || !Character.isLetter(character)) {
            System.out.println("Error: Please enter a single letter.");
        } else {
            char lowerCase = Character.toLowerCase(character);

            if (lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }
    }
}



