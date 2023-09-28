public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,6,4};
        System.out.println(linears(arr, 2));
    }
    //search in the array return the index if item found otherwise if the item not found return -1
    static int linears(int[]arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
