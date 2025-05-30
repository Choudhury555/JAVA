package BASIC;

import java.util.Arrays;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over a lazy dog";

        System.out.println(findLongestWord(sentence));
    }

    private static String findLongestWord(String sentence) {
        if(sentence==null || sentence==""){
            return "";
        }

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int maxLen = 0;
        String longestWord="";

        for(String word:words){
            if(word.length()>maxLen){
                maxLen=word.length();
                longestWord=word;
            }
        }
        return longestWord;
    }
}
