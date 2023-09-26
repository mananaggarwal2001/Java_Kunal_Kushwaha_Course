import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first=0;
        int second=1;
        int range= sc.nextInt();
        System.out.println(first);
        System.out.println(second);
        for(int i=0;i<range-2;i++){
            int temp= first+second;
            first=second;
            second=temp;
            System.out.println(temp);
        }
    }
}
