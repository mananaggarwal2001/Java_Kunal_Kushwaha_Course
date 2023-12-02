public class Pattern7 {
    public static void main(String[] args) {
        patternPrint(4);
    }

    static void patternPrint(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number-i; j >0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
