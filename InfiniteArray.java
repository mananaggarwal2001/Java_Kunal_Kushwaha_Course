public class InfiniteArray {
    public static void main(String[] args) {
        // start with the box of the size 2
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 23, 34, 45, 67, 87, 100, 101, 122, 123, 124, 125};
        int finalanswer = findingRange(arr, 12);
        System.out.println("The index at which the particular value is present is :- " + finalanswer);
    }

    static int findingRange(int[] arr, int target) {
        int end = 1;
        int start = 0;
        while (arr[end] < target) {
            int newStart = end + 1;
            // for find the new end we have to take the double of the size of the start and the end.
            // the new end will be this as given below.
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
