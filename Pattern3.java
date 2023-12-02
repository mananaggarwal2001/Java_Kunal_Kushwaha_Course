public class Pattern3 {
    public static void main(String[] args) {
        printPattern(5);
    }
    static void printPattern(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
