public class Pattern4 {
    public static void main(String[] args) {
        numberPattern(5);
    }
    static void numberPattern(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
