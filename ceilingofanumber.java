public class ceilingofanumber {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,10,12,14,16};
        int target= 7;
        int finalnumber= ceilingnumber(arr, target);
        System.out.println("The Ceiling of the number is :- " + finalnumber);
    }

    private static int ceilingnumber(int[] arr, int target) {
        // if the number larger than the largest given number in the array then there is no ceiling.
        if(arr[arr.length-1]== target){
            return -1;
        }

        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(arr[mid]== target){
                return arr[mid];
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return arr[low]; // when the number is greater than the target in the condition of the binary search.f
    }
}
