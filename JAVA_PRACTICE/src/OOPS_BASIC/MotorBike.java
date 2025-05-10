package OOPS_BASIC;

public class MotorBike {
    private int speed;

    MotorBike(){
        this(5);//here we are calling in Parametrized Constructor with a value 5
        System.out.println("Default Constructor called");
    }

    MotorBike(int speed){
        System.out.println("Parametrized Constructor called");
        this.speed=speed;
    }

    void setSpeed(int speed){
        if(speed>0){
            this.speed=speed;
        }
    }
    int getSpeed(){
        return this.speed;
    }

    public void increaseSpeed(int incSpeed){
        setSpeed(this.speed+incSpeed);
    }

    public void decreaseSpeed(int decSpeed){
        setSpeed(this.speed-decSpeed);
    }

    void start(){
        System.out.println("Bike Started");
    }
}
