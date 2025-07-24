package OOPS_BASIC.INHERITANCE;

import java.math.BigDecimal;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Choudhury Abhisek Panda","Software Developer 2");

        employee.setEmail("cap@gmail.com");
        employee.setPhoneNumber("1234567890");
        employee.setEmployerName("Google");
        employee.setEmployeeGrade('A');
        employee.setSalary(BigDecimal.valueOf(6300000.00));

        System.out.println(employee);
    }
}
