package homeworkweek8;
/*
 * 9.	Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

/*
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber9 {
    public static void main(String[] args) {
        int n = 8; // The number of terms to print

        int a = 1;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}


