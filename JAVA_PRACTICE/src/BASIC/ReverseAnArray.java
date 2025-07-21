package BASIC;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,15,25};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int[] arr){
        if(arr.length<1){
            return;
        }

        for(int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
}
