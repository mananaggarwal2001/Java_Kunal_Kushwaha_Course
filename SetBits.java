import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the set bits:- ");
        int number= scanner.nextInt();
        System.out.println("The Number in binary representation is :- " + Integer.toBinaryString(number));
        System.out.println(setBits(number));
    }
    private static int setBits(int number){
        int count=0;
        while(number>0){
            count++;
            number-=number& (-number); // for finding the number of set bits in the binary representation.
            // running the log(N) times for finding the number of setbits.
        }
        return count;
    }
}
