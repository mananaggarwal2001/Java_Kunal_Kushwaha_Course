import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1, 0, -32, 7, 4, 3};
        BSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BSort(int[] arr) {
        int length = arr.length;
        boolean isswapped;
        // run the steps n-1 Times
        for (int i = 0; i < length; i++) {
            isswapped = false; // for checking whether the given array is sorted or not.
            // for each iteration the largest value will come at the end of the index in the array.
            for (int j = 1; j <= length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isswapped = true;
                }
            }
            if (!isswapped) { // for breaking the loop when the given array is sorted already.
                break;
            }
        }
    }
}
