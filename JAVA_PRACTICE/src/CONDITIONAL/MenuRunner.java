package CONDITIONAL;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1 = ");
        int num1 = sc.nextInt();

        System.out.print("Enter number2 = ");
        int num2 = sc.nextInt();

        System.out.println("Choices available are");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");

        System.out.print("Enter Choice = ");
        int choice = sc.nextInt();

        System.out.println("You have entered");
        System.out.println("Number1 = "+ num1);
        System.out.println("Number2 = "+ num2);
        System.out.println("Choice = "+ choice);

        PerformOperationUsingSwitch(choice, num1, num2);
    }

    private static void PerformOperationUsingNestedIfElse(int choice, int num1, int num2) {
        if(choice ==1){
            System.out.println("Result is "+ (num1 + num2));
        } else if (choice ==2) {
            System.out.println("Result is "+ (num1 - num2));
        } else if (choice ==3) {
            System.out.println("Result is "+ (num1 / num2));
        }else if(choice ==4){
            System.out.println("Result is "+ (num1 * num2));
        }else {
            System.out.println("Invalid Choice");
        }
    }

    private static void PerformOperationUsingSwitch(int choice, int num1, int num2) {
        switch (choice){
            case 1 :
                System.out.println("Result is "+ (num1 + num2));
                break;
            case 2 :
                System.out.println("Result is "+ (num1 - num2));
                break;
            case 3 :
                System.out.println("Result is "+ (num1 / num2));
                break;
            case 4 :
                System.out.println("Result is "+ (num1 * num2));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
