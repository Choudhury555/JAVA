package BASIC;

public class ExamResult {
    public boolean isPass(int marks){
        return marks > 50;
    }

    public static void main(String[] args) {
        ExamResult ex = new ExamResult();
        if(ex.isPass(97)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
