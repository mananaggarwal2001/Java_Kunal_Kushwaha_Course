import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
