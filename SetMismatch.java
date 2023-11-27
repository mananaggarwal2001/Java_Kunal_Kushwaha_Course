import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        Cyclicsort(arr);
        int[] finalList = findNumber(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(finalList));
    }

    static void Cyclicsort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp = arr[i];
            if (i + 1 != arr[i] && arr[i] != arr[temp - 1]) {
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
    }

    static int[] findNumber(int[] arr) {
        int[] finalArray = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                finalArray[0] = arr[i];
                finalArray[1] = i + 1;
                break;
            }
        }
        return finalArray;
    }
}
