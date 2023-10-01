public class LettersCheckinginJava {
    public static void main(String[] args) {
        
    }
    public static  char nextGreatestLetter(char[] letters, char target) {
        return smallestLetter(letters, target);
    }
    static char smallestLetter(char[] letters, char target){
        int start=0;
        int end= letters.length-1;
        // check for the wrapping condition
        if(letters[letters.length-1]<target){
            return letters[0];
        }
        while(start<=end){
            int mid= start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(start==letters.length){
            return letters[0];
        }
        return letters[start];
    }
}
