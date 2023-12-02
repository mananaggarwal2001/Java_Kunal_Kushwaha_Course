public class Pattern8 {
    private static int spaceNumber;

    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int number) {
        for (int i = 1; i <= number * 2; i++) {
            int spaceNumber = i > number ? i - number : number - i;
            if (i <= number) {

                for (int j = 0; j < spaceNumber; j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 0; j < spaceNumber; j++) {
                    System.out.print("  ");
                }
                for (int j = (number * 2 - i); j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= (number * 2 - i); j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
