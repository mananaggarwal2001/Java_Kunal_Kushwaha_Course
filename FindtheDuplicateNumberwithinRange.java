import java.util.ArrayList;
import java.util.Arrays;

public class FindtheDuplicateNumberwithinRange {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cycleSort(arr);
        ArrayList<Integer> finalList = FindingtheDuplicates(arr);
        System.out.println(finalList);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp = arr[i];
            if (i + 1 != arr[i] && temp != arr[temp - 1]) {
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp; // for finding all the duplicates in the number for doing the work.
            } else {
                i++;
            }
        }
    }

    static ArrayList<Integer> FindingtheDuplicates(int[] arr) {
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                finalList.add(arr[i]);
            }
        }
        return finalList;
    }
}
