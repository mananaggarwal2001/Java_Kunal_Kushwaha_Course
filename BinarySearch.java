public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,12,23,34,45,56,78,90};
        int target= 45;
        int finalanswer= binarySearch(arr, target);
        System.out.println("The final position of the element in the array is :- " + finalanswer);
    }
    static int binarySearch(int [] arr , int target){
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
//            int mid= (start+end)/2; there sum might be exceeding the total value of the start and it will beyond the size of the data type which will throw the error that data limit exceed.
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end= mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
