import java.util.Scanner;

public class findwhetherthenumberisevenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int number = scanner.nextInt();
        boolean result = finalnumber(number);
        if (result) {
            System.out.println("The number is even number");
        } else {
            System.out.println("The number is odd number");
        }
    }

    static boolean finalnumber(int number) {
        return (number & 1) != 1;
    }
}