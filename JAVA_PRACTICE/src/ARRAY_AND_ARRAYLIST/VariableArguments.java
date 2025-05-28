package ARRAY_AND_ARRAYLIST;

import java.util.Arrays;

public class VariableArguments {
    static void print(int... values){
        System.out.println(Arrays.toString(values));
    }
    static int sum(int ...nums){
        int sum=0;
        for(int n:nums){
            sum=sum+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        print(1);
        print(1,2);
        print(1,2,3,4,5);

        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,6));
    }
}
