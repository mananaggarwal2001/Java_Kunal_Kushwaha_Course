import java.util.Scanner;

public class Findingthenthfibonaccinumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you want the fibonacci number :- ");
        int number = scanner.nextInt();
        System.out.println("The fibonacci number of the given number " + number + " is ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonaccinumber(i));
            if (i == number - 1) {
                System.out.println();
            } else {
                System.out.print(",");
            }
        }
    }

    static long  fibonaccinumber(int number) {
        long finalnumber = (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), number) - Math.pow(((1 - Math.sqrt(5)) / 2), number)) / Math.sqrt(5));
//        long finalnumber = (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), number)) / Math.sqrt(5)); // sexy formula for getting the fibonacci number.
        return finalnumber;
    }
}
