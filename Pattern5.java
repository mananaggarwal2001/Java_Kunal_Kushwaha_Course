public class Pattern5 {
    public static void main(String[] args) {
        numberPattern(5);
    }
    static void numberPattern(int number) {
        for (int i = 1; i <= number * 2; i++) {
            int finalNumber = i <= 5 ? i : number * 2 - i; // ternary operator is being used for checking the condition.
            for (int j = 0; j < finalNumber; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
