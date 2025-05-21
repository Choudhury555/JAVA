package BASIC;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(123405));
    }

    public static int reverseNum(int n){
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
