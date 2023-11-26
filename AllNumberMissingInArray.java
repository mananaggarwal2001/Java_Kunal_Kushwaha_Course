import java.util.ArrayList;
import java.util.Arrays;
public class AllNumberMissingInArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cycleSortFortheSameIndex(arr);
        ArrayList<Integer> finalList= findTheNumber(arr);
        System.out.println(finalList);
    }

    static void cycleSortFortheSameIndex(int[] arr) {
        int length = arr.length; // for getting the length of the given array.
        int i = 0;
        while (i != arr.length) {
            int temp = arr[i];
            if (temp < arr.length+1) {

                if (temp != i + 1 && temp != arr[temp - 1]) {
                    arr[i] = arr[temp - 1];
                    arr[temp - 1] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    static ArrayList<Integer> findTheNumber(int[] arr) {
        int length = arr.length;
        ArrayList<Integer> finalList= new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i+1 != arr[i]) {
                finalList.add(i+1);
            }
        }
        return finalList;
    }
}
