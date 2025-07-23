package OOPS_BASIC;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("Jajpur","Odisha","India");
        Address workAddress = new Address("Bangalore","Bangalore","India");

        Customer customer = new Customer("Abhisek",homeAddress);

        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
