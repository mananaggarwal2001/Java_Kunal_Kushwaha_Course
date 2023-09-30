import java.util.Arrays;

public class Maximum_in_2D_Array {
    public static void main(String[] args) {
        int[][] newintegerArray= {{1,2,3,4,5},{6,7,90,9},{10,11,12,13,14},{15,16,17,18}};
        int finalvalue= search(newintegerArray);
        System.out.println("The maximum value in the 2D Array is :- " + finalvalue);
    }
    static int search(int[][] arr){
        int max= Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
