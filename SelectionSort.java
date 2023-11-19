import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-5, -21, 34, 0, 45, 1, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            // find the maximum element in the entire array for doing the work.
            int last = length - i - 1;
            int getMaxIndex = getIndex(arr, 0, last);
            //swap with the correct index position.
            int temp = arr[getMaxIndex];
            arr[getMaxIndex] = arr[last];
            arr[last] = temp;
        }
    }
    static int getIndex(int[] arr, int start, int last) {
        int position = 0;
        int resultValue = Integer.MIN_VALUE;
        for (int i = start; i <= last; i++) {
            if (arr[i] > resultValue) {
                resultValue = arr[i];
                position = i;
            }
        }
        return position;
    }
}
