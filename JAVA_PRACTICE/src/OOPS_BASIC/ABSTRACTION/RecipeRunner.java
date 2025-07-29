package OOPS_BASIC.ABSTRACTION;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe1 = new Recipe1();
        recipe1.execute();

        System.out.println();

        RecipeWithMicrowave recipe2 = new RecipeWithMicrowave();
        recipe2.execute();


    }
}
