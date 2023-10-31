package homeworkweek8;

import java.util.Scanner;

/*
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class RightAngleTriangle8 {
    public static void rightAngleTriangle(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input for console
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        rightAngleTriangle(sc.nextInt());
        //closing the scanner
        sc.close();
    }
}
