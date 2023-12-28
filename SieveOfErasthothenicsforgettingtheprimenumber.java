import java.util.ArrayList;
import java.util.Scanner;

public class SieveOfErasthothenicsforgettingtheprimenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the range of the prime number:- ");
        int number = scanner.nextInt();
        boolean[] numberArray = new boolean[number + 1];
        isPrime(numberArray, number);
    }
    // false in array means number is prime.
    // time complexity of this program is :- O(N*log(log(N)))
    static void isPrime(boolean[] array, int number) {
        for (int i = 2; i * i <= number; i++) {
            if (!array[i]) {
                for (int j = i * 2; j <= number; j += i) {
                    array[j] = true;
                }
            }
        }
        for (int i = 2; i < array.length; i++) {
            if (!array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
