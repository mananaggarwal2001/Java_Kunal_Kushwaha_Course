import java.util.Arrays;

public class SearchinginMatrices {
    public static void main(String[] args) {
        int[][] numberInteger= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(matrixSearch(numberInteger, 101)));
    }
    static int[] matrixSearch(int[][]arr, int target){
        int r= 0;
        int c= arr.length-1;
        while(r< arr.length && c>=0)
        {
            if(arr[r][c]==target){
                return new int[]{r,c};
            }else if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
