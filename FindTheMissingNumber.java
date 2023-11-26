import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 4};
        cycleSortFortheSameIndex(arr);
        int finalAnswer= findTheNumber(arr);
        System.out.println("The missing number in  the array is :- "+ finalAnswer);
    }

    static void cycleSortFortheSameIndex(int[] arr) {
        int length = arr.length; // for getting the length of the given array.
        int i = 0;
        while (i != arr.length) {
            int temp = arr[i];
            if (temp >= arr.length) {
                i++; // for changing the value in the index in the array.
            } else {

                if (arr[i] != i) {
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                } else {
                    i++;
                }
            }
        }
    }

    static int findTheNumber(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return arr.length;
    }
}


