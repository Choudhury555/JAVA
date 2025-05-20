package LOOPS;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;

        do{
            System.out.print("Enter a Number = ");
            num = sc.nextInt();
            if(num>=0){
                System.out.println("Cube is = "+num*num*num);
            }
        }while(num>=0);
        System.out.println("Than You");
    }
}
