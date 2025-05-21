package BASIC;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(6));
    }

    public static int calculateFactorial(int n){
        if(n<0){
            return -1;
        }
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
