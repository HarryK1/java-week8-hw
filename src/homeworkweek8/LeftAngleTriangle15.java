package homeworkweek8;
/*
 *15.	Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class LeftAngleTriangle15 {
    public static void leftTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a =sc.nextInt();
        leftTriangle(a);
        //closing scanner
        sc.close();
    }

}

