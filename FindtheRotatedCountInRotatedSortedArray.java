public class FindtheRotatedCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(rotationcount(arr));
    }
    static int rotationcount(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        if (arr[low] <= arr[high]) {
            return low; // critical case in for the finding the number of rotations.
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[mid] < arr[low]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
