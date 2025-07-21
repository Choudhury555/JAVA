package BASIC;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(checkSoted(arr));
    }

    public static Boolean checkSoted(int[] arr){
        if(arr.length<=1){
            return true;
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }
}

