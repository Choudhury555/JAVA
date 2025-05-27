package ARRAY_AND_ARRAYLIST;

import java.util.Arrays;

public class Array_Practice_4 {
    public static void main(String[] args) {
        int[] marks = {100,99,95,96,100};

        for(int mark:marks){
            System.out.println(mark);
        }

        /////Arrays.fill/////
        int[] temp = new int[5];
        Arrays.fill(temp,7);
        for(int t:temp){
            System.out.print(t+" ");
        }
        System.out.println();

        /////Arrays.equals/////
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = {1,2,4};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));

        /////Arrays.sort/////
        int[] arr4 = {4,2,6,5,1,3};
        Arrays.sort(arr4);
        for(int ele:arr4){
            System.out.print(ele+" ");
        }
    }
}
