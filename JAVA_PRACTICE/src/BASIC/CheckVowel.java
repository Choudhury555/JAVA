package BASIC;

public class CheckVowel {
    public static void main(String[] args) {
        System.out.println(isVowel('d'));
        System.out.println(isVowel('A'));
    }

    private static boolean isVowel(char ch) {
        switch(ch){
            case 'a','e','i','o','u','A','E','I','O','U': return true;
            default: return false;
        }
    }
}
