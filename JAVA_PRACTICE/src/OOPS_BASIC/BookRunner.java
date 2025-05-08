package OOPS_BASIC;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.pages();
        effectiveJava.pages();
        cleanCode.pages();

        artOfComputerProgramming.setNoOfCopies(5);
        effectiveJava.setNoOfCopies(7);
        cleanCode.setNoOfCopies(3);

        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());
    }
}
