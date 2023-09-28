public class LinearSearchInStrings {
    public static void main(String[] args) {
        String NumberString= "NumberString";
        char target= 'N';
        System.out.println(stringSearch(NumberString, target));
    }
    static boolean stringSearch(String s, char target){
        if(s.isEmpty()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    // foreach method for searching the characters in the Strings.
    static boolean stringSearch2(String s, char target){
        if(s.isEmpty()){
            return false;
        }
        for (char value: s.toCharArray()) {
            if(value==target){
                return true;
            }
        }
        return false;
    }
}
