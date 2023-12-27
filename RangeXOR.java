public class RangeXOR {
    public static void main(String[] args) {
        // range xor for a,b = xor(b) ^ xor(a-1)
        int a=3;
        int b=9;
        int ans= xor(b) ^ xor(a-1);
        System.out.println("The range XOR of the number is :- " + ans);
    }

    // this gives XOR from 0 to a
    static int xor(int number) {
        if (number % 4 == 0) {
            return number;
        }
        if (number % 4 == 1) {
            return 1;
        }
        if (number % 4 == 2) {
            return number + 1;
        }
        return 0;
    }
}
