package LOOPS;

public class MyNumber {

    private int num;

    public MyNumber(int num) {
        this.num=num;
    }

    public boolean isPrime() {
        if(num<2){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public int sumUpToN() {
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public void printNumberTriangle() {
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
