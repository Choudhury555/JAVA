package ARRAY_AND_ARRAYLIST;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {97,98,100};
        Student student_1 = new Student("Abhisek",marks);
        Student student_2 = new Student("Choudhury",95,94,99,100,98);//Also we can pass like this because in "Student" class we are using "variable arguments"(...marks) to receive different no. of arguments

        System.out.println("Number of marks : "+student_1.getNumberOfMarks());
        System.out.println("Total marks : "+student_1.getTotalSumOfMarks());
        System.out.println("Maximum marks : "+student_1.getMaximumMarks());
        System.out.println("Minimum marks : "+student_1.getMinimumMarks());

        BigDecimal average_1 = student_1.getAverageMarks();
        System.out.println("Average marks : "+average_1);

        System.out.println();

        System.out.println("Number of marks : "+student_2.getNumberOfMarks());
        System.out.println("Total marks : "+student_2.getTotalSumOfMarks());
        System.out.println("Maximum marks : "+student_2.getMaximumMarks());
        System.out.println("Minimum marks : "+student_2.getMinimumMarks());

        BigDecimal average_2 = student_2.getAverageMarks();
        System.out.println("Average marks : "+average_2);

        System.out.println(student_1);//coming from "toString()" method of Student class

        student_1.addMark(91);

        System.out.println(student_1);

        student_1.removeMarkAtIndex(2);

        System.out.println(student_1);
    }
}
