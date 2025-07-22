package OOPS_BASIC;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1",0.5,"Blue");

        fan.switchOn();
        System.out.println(fan);//by default toString() will be called

        fan.setSpeed((byte) 4);
        System.out.println(fan);//by default toString() will be called

        fan.switchOff();
        System.out.println(fan);//by default toString() will be called


    }
}
