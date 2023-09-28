import java.util.Arrays;
public class SearchInThe2DArray {
    public static void main(String[] args) {
        int[][] newintegerArray= {{1,2,3,4,5},{6,7,8,9},{10,11,12,13,14},{15,16,17,18}};
        int[] finalvalue= maxvalue(newintegerArray, 13);
        System.out.println(Arrays.toString(finalvalue));
    }
    static int[] maxvalue(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
