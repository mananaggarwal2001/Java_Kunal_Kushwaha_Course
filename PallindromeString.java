import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String:- ");
        String str2 = scanner.nextLine();
        if (isPallindrome(str2)) {
            System.out.println("Given Strings is Pallindrome");
        } else {
            System.out.println("Given Strings is not Pallindrome");
        }
    }

    static boolean isPallindrome(String str2) {
        if (str2.isEmpty()) {
            return true;
        }
        str2 = str2.toLowerCase();
        int start = 0;
        int end = str2.length() - 1;
        while (start != end) {
            if (str2.charAt(start) == str2.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
