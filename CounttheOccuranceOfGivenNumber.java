import java.util.Scanner;

public class CounttheOccuranceOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the given Number :- ");
        int number= sc.nextInt();
        System.out.print("Enter the Number for which You Want to count the Occurances:- ");
        int target= sc.nextInt();
        int count=0;
        while(number!=0){
            int value= number%10;
            if(value==target)
            {
                count++;
            }
            number/=10;
        }
        System.out.println("the count of the given Number is :- " + count);

    }
}
