package BASIC;

public class SumOFDigits {
    public static void main(String[] args) {
        System.out.println(calculateSumOfDigits(4567));
    }

    public static int calculateSumOfDigits(int n){
        if(n<0){
            return -1;
        }
        int sum=0;

        while(n > 0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}
