package BASIC;

public class CheckIfSumOfTwoArraysEqual {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};
        int[] arr2 = {20,20,5,3,2,10};

        System.out.println(sumOfElements(arr1)==sumOfElements(arr2));
    }

    private static int sumOfElements(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
