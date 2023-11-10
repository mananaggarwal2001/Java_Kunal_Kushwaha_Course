import java.util.Arrays;

public class SearchinthePurelySortedArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(array, 9)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautions over here.
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        // run the loop till 2 rows are remaning.
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows.
        // check whether the target is in the column or not.
        if (matrix[rStart][cMid] == target) { // if the element is found in the middle position itself.
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) { // if the element is found in the middle position of the second row itself.
            return new int[]{rStart + 1, cMid};
        }
        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // search in 4th half
        if (target >= matrix[rStart + 1][cMid + 1] && target <= matrix[rStart + 1][cols - 1]) {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
        return new int[]{-1, -1};
    }
}
