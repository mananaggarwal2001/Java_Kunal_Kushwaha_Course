public class Pattern2 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
