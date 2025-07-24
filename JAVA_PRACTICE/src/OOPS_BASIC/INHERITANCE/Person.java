package OOPS_BASIC.INHERITANCE;

public class Person {//Every class is inheriting from OBJECT class (OBJECT is at the top of hierarchy)
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name){
        System.out.println("Person Constructor");
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){//Actually this toString() method is already present in OBJECT class, but we are OVERRIDING this method and implementing in our way.
        return name + " " + email + " " + phoneNumber;
    }
}
