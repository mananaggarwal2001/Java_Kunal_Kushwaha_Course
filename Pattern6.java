public class Pattern6 {
    public static void main(String[] args) {
        patternprint(5);
    }

    static void patternprint(int number) {
        for (int i = 1; i < number * 2; i++) {
            int finalanswer = i < number ? i : (number * 2 - i);
            int spacePrint = i < number ? number - i : (i - number);
            for (int j = 0; j < spacePrint; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < finalanswer; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
