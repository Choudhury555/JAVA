package BASIC;

public class CountUpperCaseLetters {
    public static void main(String[] args) {
        String str = "I Love My India.";
        System.out.println(calculateUpperCaseLetters(str));
    }

    public static int calculateUpperCaseLetters(String str){
        if(str==null){
            return -1;
        }
        if(str.length()==0){
            return 0;
        }

        int count=0;
        for(int i = 0; i<str.length(); i++){
//            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
//                count++;
//            }
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
