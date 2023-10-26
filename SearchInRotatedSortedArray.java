import org.w3c.dom.html.HTMLAreaElement;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        // rotated binary search in the given array for doing the work.
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
        int pivot = findPivot(arr);
        int target = 6;
        // if the pivot element that we have found is equal to the given target
        if (arr[pivot] == target) {
            // return the pivot element index
        }
        if (arr[0] > target) {
            binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
        binarySearch(arr, target, 0, pivot - 1);
        // if the pivot that we have found is not equal to the given target.
    }

    static int findPivot(int[] arr) {
        // pivot is the biggest number which we will find to do the stuffs.
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases will work here
            // case:-1
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; // this means we have found the answer for doing the work in the case of finding the pivot element.
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        // pivot is the biggest number which we will find to do the stuffs.
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // 4 cases will work here
            // case:-1
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; // this means we have found the answer for doing the work in the case of finding the pivot element.
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if the start and the end were the same elements then we have to skip the one elements from the start and the end.
            // check if the start is pivot for doing the work.
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether the end is pivot or not.
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } // left side is sorted so the pivot is right.
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
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
