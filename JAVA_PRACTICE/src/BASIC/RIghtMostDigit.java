package BASIC;

public class RIghtMostDigit {
    public static void main(String[] args) {
        String str = "There is 1 apple and 7 bananas.";
        System.out.println(findRightMostDigitInASentence(str));
    }

    private static int findRightMostDigitInASentence(String str) {
        if(str==null){
            return -1;
        }
        for(int i=str.length()-1;i>=0;i--){
//            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
//                return str.charAt(i)-'0';
//            }
            if(Character.isDigit(str.charAt(i))){
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }
}
