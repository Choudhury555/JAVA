package OOPS_BASIC;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike honda = new MotorBike();
        MotorBike re = new MotorBike(1);
        MotorBike ducati = new MotorBike(2);

        System.out.println(honda.getSpeed());
        System.out.println(ducati.getSpeed());
        System.out.println(re.getSpeed());

        re.start();
        ducati.start();

        ducati.setSpeed(80);
        re.setSpeed(40);

        ducati.increaseSpeed(40);
        re.increaseSpeed(30);

        System.out.println(ducati.getSpeed());
        System.out.println(re.getSpeed());

        ducati.decreaseSpeed(40);
        re.decreaseSpeed(300);

        System.out.println(ducati.getSpeed());
        System.out.println(re.getSpeed());

    }
}
