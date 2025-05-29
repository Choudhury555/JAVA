package ARRAY_AND_ARRAYLIST;

public class Array_Practice_6 {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        String daysWithMostChar = "";
        for(String day:daysOfWeek){
            if(day.length()>daysWithMostChar.length()){
                daysWithMostChar=day;
            }
        }

        System.out.println("Day with most character is = "+daysWithMostChar);

        for(int i= daysOfWeek.length-1;i>=0;i--){
            System.out.print(daysOfWeek[i]+ " ");
        }
    }
}
