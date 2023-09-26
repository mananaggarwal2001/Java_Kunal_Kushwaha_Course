import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().trim().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }else{
            System.out.println("lowercase");
        }
    }
}
