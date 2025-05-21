package BASIC;

public class GCD {
    public static void main(String[] args) {
        System.out.println(calculateGCD(48,18));
    }

    public static int calculateGCD(int a,int b){
        if(a==0 || b==0){
            return 0;
        }

        if(a<0 || b<0){
            return 1;
        }

        while(b%a != 0){
            int rem = b%a;
            b=a;
            a=rem;
        }
        return a;
    }
}
