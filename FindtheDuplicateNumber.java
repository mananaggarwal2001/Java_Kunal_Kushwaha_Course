import java.util.ArrayList;
import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 4, 7, 8, 3, 1};
        CycleSort(arr);
        int finalAnswer = findtheDuplicates(arr);
        System.out.println("The final Answer of the given Array is :- " + finalAnswer);
    }
    static void CycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp = arr[i];
            if (i + 1 != arr[i] && temp != arr[temp - 1]) {
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
    }

    static int findtheDuplicates(int[] arr) {
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                return arr[i];
            }
        }
        return -1;
    }
}
