package ARRAY_AND_ARRAYLIST;

import java.util.Arrays;

public class Array_Practice_3 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        double[] values = new double[5];
        boolean[] test = new boolean[5];
        Array_Practice_3[] obj = new Array_Practice_3[5];

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        for (double value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        for (boolean b : test) {
            System.out.print(b + " ");
        }
        System.out.println();

        for (Array_Practice_3 arrayPractice3 : obj) {
            System.out.print(arrayPractice3 + " ");
        }
        System.out.println();
        /////TO Directly print the whole array (use the static method in the "Arrays" class)
        System.out.println(Arrays.toString(marks));
    }
}
