public class floorofthenumber {
    public static void main(String[] args) {
            int[] arr= {2,4,6,8,10,12,14,16};
            int target= 3;
            int finalnumber= floorNumber(arr, target);
            System.out.println("The Floor of the Number is :- " + finalnumber);
    }
    private static int floorNumber(int[] arr, int target) {
        // if the target number is smaller then smallest given number in the array then there is no floor number
        if(target<arr[0]){
            return -1;
        }
        int start= 0;
        int end= arr.length-1;
        while (start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[end]; // this will give the floor of the number which is the number less than or equal to the number.
    }
}
