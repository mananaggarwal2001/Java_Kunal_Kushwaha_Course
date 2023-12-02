public class Pattern9 {
    public static void main(String[] args) {
        numberpattern(4);
    }

    static void numberpattern(int number) {
        int count = 1;
        for (int i = 0; i <= number * 2; i++) {
            for (int j = 0; j <= number * 2; j++) {
                int top = i;// top will be equal to row number that means how many rows we have come so far.
                int bottom = number * 2 - i;
                int right = number * 2 - j;
                int left = j;
                int finalanswer = number - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(finalanswer + " ");
            }
            System.out.println();
        }
    }
}
