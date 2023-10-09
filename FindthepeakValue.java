//interface MountainArray {
//       default int get(int index) {}
//       default int length() {}
//}
public class FindthepeakValue {
    public static void main(String[] args) {
        System.out.println("This is the binary search question");
    }
//    static int findpeakElement(MountainArray mountainArr){
//        int low=0;
//        int high=mountainArr.length()-1;
//        while(low<=high){
//            int mid= low+(high-low)/2;
//            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
//                low=mid+1;
//            }else{
//                high=mid-1;
//            }
//        }
//        return low;
//    }
//
//    static int orderAgnosticSearch(int target, MountainArray mountainArr, int peakIndex){
//        int low=0;
//        int high=peakIndex;
//
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if(mountainArr.get(mid)==target){
//                return mid;
//            }else if(mountainArr.get(mid)>target){
//                high=mid-1;
//            }else{
//                low=mid+1;
//            }
//        }
//        int start=peakIndex;
//        int end=mountainArr.length()-1;
//        while(start<=end){
//            int mid= start+(end-start)/2;
//            if(mountainArr.get(mid)==target){
//                return mid;
//            }else if(mountainArr.get(mid)>target){
//                start=mid+1;
//            }else{
//                end=mid-1;
//            }
//        }
//        return -1;
//    }
}
