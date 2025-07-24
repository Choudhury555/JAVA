package OOPS_BASIC.INHERITANCE;

public class Student extends Person {//IS-A Relation(Student is a Person)
    private String college;
    private int year;

    public Student(String name,String college){
        super(name);
        this.college=college;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
