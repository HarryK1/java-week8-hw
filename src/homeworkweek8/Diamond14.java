package homeworkweek8;
/*
 * 14.	Write a program in Java to display the pattern like a diamond. While loop
 *
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */

import java.util.Scanner;

public class Diamond14 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond: ");
        int n = scanner.nextInt();

        scanner.close();

        int i = 1;

        // Upper half of the diamond
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print("  "); // Print spaces
                spaces++;
            }

            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("* "); // Print stars
                stars++;
            }

            System.out.println(); // Move to the next line
            i++;
        }

        i = n - 1;

        // Lower half of the diamond (excluding the center row)
        while (i >= 1) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print("  "); // Print spaces
                spaces++;
            }

            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("* "); // Print stars
                stars++;
            }

            System.out.println(); // Move to the next line
            i--;
        }
    }
}

