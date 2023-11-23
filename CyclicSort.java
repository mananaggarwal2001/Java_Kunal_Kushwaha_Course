import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
    }
}
