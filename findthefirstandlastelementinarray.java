import java.util.Arrays;

public class findthefirstandlastelementinarray {
    public static void main(String[] args) {
    int[] arr= {5,8,8,10};
    int target= 7;
    int[] finalArray= {-1,-1};
    lowerboundValue(arr, target, finalArray);
    upperboundValue(arr, target, finalArray);
        System.out.println(Arrays.toString(finalArray));

    }

    public static void lowerboundValue(int[] arr, int target, int[] array){
        int[] numberRange= new int[2];
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(arr[start]==target){
        array[0]= start;
        }
    }
    public static void upperboundValue(int []arr, int target, int[] array){
        int[] numberRange= new int[2];
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]<=target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(arr[end]==target){
            array[1]=end;
        }
    }

}
