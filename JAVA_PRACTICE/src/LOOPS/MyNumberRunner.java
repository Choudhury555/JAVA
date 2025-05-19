package LOOPS;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(8);
        System.out.println("isPrime = "+number.isPrime());
        System.out.println("sumUpToN = "+number.sumUpToN());
        System.out.println("sumOfDivisors = "+number.sumOfDivisors());
        number.printNumberTriangle();
    }
}
