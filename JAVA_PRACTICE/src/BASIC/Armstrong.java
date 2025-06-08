package BASIC;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(checkArmstrongNumber(153));//true
        System.out.println(checkArmstrongNumber(154));//false
        System.out.println(checkArmstrongNumber(371));//true
        System.out.println(checkArmstrongNumber(377));//false
    }

    public static Boolean checkArmstrongNumber(int n){
        int sum=0,tempN=n;

        while(tempN!=0){
            sum=(int)(sum+Math.pow(tempN%10,3));
            tempN=tempN/10;
        }
        return sum==n;
    }
}
