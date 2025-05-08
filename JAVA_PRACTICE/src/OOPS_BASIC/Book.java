package OOPS_BASIC;

public class Book {
    private int noOfCopies;

    void setNoOfCopies(int noOfCopies){
        this.noOfCopies=noOfCopies;
    }

    int getNoOfCopies(){
        return this.noOfCopies;
    }

    void pages(){
        System.out.println("Book has some copies");
    }
}
