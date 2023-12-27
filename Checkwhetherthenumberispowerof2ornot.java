import java.util.Scanner;

public class Checkwhetherthenumberispowerof2ornot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // note fix for n=0
        System.out.print("Enter the number for which you want to check the number is power of 2 or not :- ");
        int number = scanner.nextInt();
        if ((number & number - 1) == 0) {
            System.out.println("The number is power of 2");
        } else {
            System.out.println("The number is not power of 2");
        }
    }
}
