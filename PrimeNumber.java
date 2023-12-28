import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number for which you want to check whether the number is prime or not:- ");
        int number = scanner.nextInt();
        if (primeNumber(number)) {
            System.out.println("The Given Number " + number + " is the Prime Number.");
        } else {
            System.out.println("The Given Number " + number + " is not the Prime Number.");
        }
    }
    static boolean primeNumber(int number) {
        for (int i = 2; i <= (int) (Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
