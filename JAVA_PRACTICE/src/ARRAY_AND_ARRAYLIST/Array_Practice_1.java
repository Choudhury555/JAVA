package ARRAY_AND_ARRAYLIST;

public class Array_Practice_1 {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40};
        int sum=0;

        for(int mark:marks){
            System.out.println(mark);
            sum=sum+mark;
        }
        System.out.println("Total Sum is = "+sum);
    }
}
