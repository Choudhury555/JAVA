package CONDITIONAL;

public class SwitchRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(3));
    }

    public static String determineNameOfDay(int dayNum) {
        String res = "";

        switch (dayNum) {
            case 0:
                res = "Sunday";
                break;
            case 1:
                res = "Monday";
                break;
            case 2:
                res = "Tuesday";
                break;
            case 3:
                res = "Wednesday";
                break;
            case 4:
                res = "Thursday";
                break;
            case 5:
                res = "Friday";
                break;
            case 6:
                res = "Saturday";
                break;
            default:
                res = "Invalid Day Number";
        }
        return res;
    }
}
