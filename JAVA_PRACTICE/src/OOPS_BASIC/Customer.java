package OOPS_BASIC;

public class Customer {

    //state
    private String name;
    private Address homeAddress;//object composition (Customer Object contains a reference to instance of Address Object)
    private Address workAddress;

    public Customer(String name,Address homeAddress){
        this.name=name;
        this.homeAddress=homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        System.out.println(homeAddress);
        return String.format("Name = %s , HomeAddress = %s, WorkAddress = %s",name,homeAddress,workAddress);
    }
}
