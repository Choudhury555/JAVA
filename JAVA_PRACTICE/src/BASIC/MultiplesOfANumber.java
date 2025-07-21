package BASIC;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOfANumber {
    public static void main(String[] args) {
        int limit=20;
        System.out.println(multipleOfAnum(3,limit));
    }

    public static List<Integer> multipleOfAnum(int n,int limit){
        List<Integer> mul = new ArrayList<>();

        if(n<=0 || limit<=0){
            return mul;
        }

        for(int i=1;n*i<limit;i++){
            mul.add(i*n);
        }

        return mul;
    }
}
