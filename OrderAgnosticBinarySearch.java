public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr= {1,2,3,12,23,34,45,56,78,90};
        int[] arr= {10,9,8,7,6,5,4,3,2,1};
        int target= 1;
        int finalanswer= binarySearch(arr, target);
        System.out.println("The final position of the element in the Order Agnostic final array is :- " + finalanswer);
    }
    static int binarySearch(int [] arr , int target){
        int start= 0;
        int end= arr.length-1;
        boolean orderChecking=arr[start]<arr[end];
        if(orderChecking) {
            while (start <= end) {
//            int mid= (start+end)/2; there sum might be exceeding the total value of the start and it will beyond the size of the data type which will throw the error that data limit exceed.
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }else {
            while (start <= end) {
//            int mid= (start+end)/2; there sum might be exceeding the total value of the start and it will beyond the size of the data type which will throw the error that data limit exceed.
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
