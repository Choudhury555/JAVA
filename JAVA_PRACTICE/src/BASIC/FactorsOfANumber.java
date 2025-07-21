package BASIC;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfANumber {
    public static void main(String[] args) {
        System.out.println(factorOfNum(18));
    }

    public static List<Integer> factorOfNum(int n){
        List<Integer> factors = new ArrayList<>();

        if(n<=0){
            return factors;
        }

        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }

        return factors;
    }
}
