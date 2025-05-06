package BASIC;

public class TimeConverter {
    public static int convertHoursToMinutes(int hours){
        if(hours<0){
            return -1;
        }
        return hours*60;
    }
    public static int convertDaysToMinutes(int days){
        if(days<0){
            return -1;
        }
        return days*24*60;
    }

    public static void main(String[] args) {
        TimeConverter time = new TimeConverter();
        System.out.println(time.convertHoursToMinutes(5));
        //we can access directly the function also as this is a static function(and we are inside the class)
        System.out.println(convertDaysToMinutes(1));
    }
}
