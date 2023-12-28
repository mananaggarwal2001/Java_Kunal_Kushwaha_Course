import java.util.Scanner;

// find the perfect square number with the decimal upto 2 places for the answer.
public class PerfectSquareNumberwithprecison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you want the square root:- ");
        int finalnumber = scanner.nextInt();
        int precesion = 3;
        System.out.printf("The Square root of the number %d is :- %.3f", finalnumber, number(finalnumber, precesion));
    }
    
    static double number(int target, int precision) {
        int left = 0;
        int right = target;
        double root = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid == target) {
                root = mid;
                return root;
            } else if (mid * mid > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= target) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
