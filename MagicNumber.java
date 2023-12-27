import java.util.Scanner;

public class MagicNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number for which you want the Magic of that number :- ");
        int number = scanner.nextInt();
        int sum=0;
        int count=1;
        while (number > 0) {
            int lastDigit = number & 1;
            sum+= (int) (Math.pow(5, count) * lastDigit);
            number=number>>1;
            count++;
        }
        System.out.println("The Magic Number is :- " + sum);
    }
}
