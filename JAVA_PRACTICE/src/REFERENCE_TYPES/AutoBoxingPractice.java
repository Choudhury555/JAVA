package REFERENCE_TYPES;

public class AutoBoxingPractice {
    public static void main(String[] args) {
        Integer n = 5;//this can be possible due to AUTO BOXING
        //AUTO BOXING coverts this line (Integer n = 5;) to this (Integer n = Integer.valueOf(5);)
        //AUTO BOXING also uses the same reference as .valueOf()
        Integer n1 = 5;
        System.out.println(n==n1);//true

        //CONSTANTS PRESENT IN WRAPPER CLASSES
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}
