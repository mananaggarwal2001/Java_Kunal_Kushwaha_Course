public class FlipAnImage {
    public static void main(String[] args) {

    }
    public int[][] flip(int[][] numberArray) {
        for (int[] row : numberArray) {
            // for reversing the array in the row
            for (int col = 0; col < (numberArray[0].length + 1) / 2; col++) {
                int temp = row[col] ^ 1;
                row[col] = row[numberArray[0].length - col - 1] ^ 1;
                row[numberArray[0].length - col - 1] = temp;
            }
        }
        return numberArray;
    }
}
