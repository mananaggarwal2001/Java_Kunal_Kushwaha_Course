public class Pattern1 {
    public static void main(String[] args) {
        patternNumber(12);
    }
    static void patternNumber(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
