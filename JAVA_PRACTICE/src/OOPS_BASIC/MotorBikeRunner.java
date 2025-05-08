package OOPS_BASIC;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike re = new MotorBike();
        MotorBike ducati = new MotorBike();

        re.start();
        ducati.start();

        re.setSpeed(80);;
        re.setSpeed(50);;
//        ducati.setSpeed(100);;

//        System.out.println(re.getSpeed());
//        System.out.println(ducati.getSpeed());

    }
}
