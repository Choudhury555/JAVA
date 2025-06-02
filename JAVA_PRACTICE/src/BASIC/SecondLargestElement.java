package BASIC;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,40,50,20,30};
        int[] arr1 = {10};
        int[] arr2 = {10,10};
        int[] arr3 = {};
        System.out.println(findSecondLargestNumber(arr));
        System.out.println(findSecondLargestNumber(arr1));
        System.out.println(findSecondLargestNumber(arr2));
        System.out.println(findSecondLargestNumber(arr3));
    }

    private static int findSecondLargestNumber(int[] arr) {
        int largest = -1,secondLargest  = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
