public class FindThelargestSuminthearray {
    public static void main(String[] args) {
        int[] numberofelement= {7,2,3,8,10,12};
        int partition= 2;
        System.out.println(splitArray(numberofelement, partition));
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int num : nums) {
            start = Math.max(start, num);
            end += num; // for finding the ending range of the given array
        } // for finding the max element in the array for doing the particular work.
        // apply binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
            int paritioncheck = numberofpartitions(nums, mid, m); // this will return the number of the pieces for doing the further work.
            if (paritioncheck > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }

    static int numberofpartitions(int[] arr, int mid, int m) {
        int number = 0;
        int pieces = 1;
        int sum = 0;
        for (int num : arr) {
            if (sum + num > mid) {
                pieces += 1;
                sum = num;
            } else {
                sum += num;
            }
        }
        return pieces;
    }
}
