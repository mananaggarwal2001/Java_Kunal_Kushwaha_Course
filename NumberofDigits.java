import java.util.Scanner;

public class NumberofDigits {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the given number for which you want to get the base of the number :- ");
        int givenNumber = scanner.nextInt();
        int base = 2;
        System.out.println("The number of digits in the given number is :- " + number(givenNumber, base));
    }
    static int number(int number, int base) {
        int finalanswer = (int) (Math.log(number) / Math.log(base)) + 1;
        return finalanswer;
    }
}
