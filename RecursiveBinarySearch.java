public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = binarySearch(arr, arr.length - 1, 0, 9);
        System.out.println("The index at which the given value is present is :- " + result);
    }
    static int binarySearch(int[] arr, int high, int low, int target) {
        int mid = low + (high - low) / 2;
        // base condition for stopping the binary search.
        if (high < low) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, mid - 1, low, target); // for doing the search in the first portion of the array.
        }
        return binarySearch(arr, high, mid + 1, target); // for doing the searching in the second portion of the array.
    }
}
