package OOPS_BASIC.INHERITANCE;

import java.math.BigDecimal;

public class Employee extends  Person{
    private String title;
    private String EmployerName;
    private char employeeGrade;
    private BigDecimal salary;

    public Employee(String name,String title){
        super(name);
        this.title=title;
        System.out.println("Employee Constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return EmployerName;
    }

    public void setEmployerName(String employerName) {
        EmployerName = employerName;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString(){
        return title + ", " + EmployerName + ", " + employeeGrade + ", " + salary + ", " +super.toString();//at last we are calling the toString() method of super class(i.e Person)
    }
}
