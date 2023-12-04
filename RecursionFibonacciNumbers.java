import java.util.Scanner;

public class RecursionFibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range for which you want the fibonacciNumbers:- ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            int result = finalAnswer(i);
            System.out.print(result);
            if (i < number - 1) {
                System.out.print(",");
            }
        }
    }

    static int finalAnswer(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return finalAnswer(n - 1) + finalAnswer(n - 2); // recursive call for getting the numbers in the fibonacci series.
    }
}
