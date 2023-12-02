public class Pattern5 {
    public static void main(String[] args) {
        numberPattern(5);
    }

    static void numberPattern(int number) {
        for (int i = 1; i <= number * 2; i++) {
            if (i <= 5) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = number * 2 - i; j > 0; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
