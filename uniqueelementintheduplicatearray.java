import java.lang.reflect.Array;
import java.util.Arrays;

public class uniqueelementintheduplicatearray {
    public static void main(String[] args) {
        int[] arraynumber = {1, 2, 3, 3, 2, 1, 6};
        int result = finalnumber(arraynumber);
        System.out.println("The unique number present in the array :- " + result);
    }

    static int finalnumber(int[] number) {
        int unique = 0;
        for (int element : number) {
            unique ^= element;
        }
        return unique; // just do the XOR of the whole array for finding the unique element in the given array.
    }
}
