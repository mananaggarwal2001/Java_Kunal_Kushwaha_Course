import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] finalArray = {2,1};
        cycleSort(finalArray);
        int finalAnswer = firstMissingNumber(finalArray);
        System.out.println(Arrays.toString(finalArray));
        System.out.println("The first missing number is:- " + finalAnswer);
    }

    static void cycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int temp = nums[i];
            if (temp <= nums.length && temp > 0) {
                if (temp != i+1 && nums[temp-1] != temp) {
                    nums[i] = nums[temp-1];
                    nums[temp-1] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }
    
    static int firstMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                return i+1;
            }
        }
        return arr.length+1;
    }
}
