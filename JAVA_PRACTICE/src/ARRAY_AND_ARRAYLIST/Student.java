package ARRAY_AND_ARRAYLIST;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int... marks) {
        this.name = name;
        for(int mark:marks){
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        return Collections.max(marks);
    }

    public int getMinimumMarks() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int sum=getTotalSumOfMarks();
        int num=getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(num),3, RoundingMode.UP);
    }

    public String toString(){
        return name + marks;
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int idx) {
        marks.remove(idx);
    }
}
