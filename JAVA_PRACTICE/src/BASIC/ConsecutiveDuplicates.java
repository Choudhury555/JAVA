package BASIC;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "abbc";
        System.out.println(hasConsecutiveDuplicates(str));
    }

    private static boolean hasConsecutiveDuplicates(String str) {
        if(str==null){
            return false;
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }
}
