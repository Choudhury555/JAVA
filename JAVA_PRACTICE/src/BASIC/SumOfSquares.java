package BASIC;

public class SumOfSquares {
    public long calculate(int n){
        if(n<0){
            return -1;
        }
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+((long) i *i);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfSquares s = new SumOfSquares();
        System.out.println(s.calculate(6));
    }
}
