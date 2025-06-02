package BASIC;

public class DoesHaveGreaterElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(doesHavegreaterNumber(arr,20));
        System.out.println(doesHavegreaterNumber(arr,700));
    }

    private static boolean doesHavegreaterNumber(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>k){
                return true;
            }
        }
        return false;
    }
}
