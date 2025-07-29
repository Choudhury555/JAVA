package OOPS_BASIC.ABSTRACTION;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the Raw material");
        System.out.println("Get the utensils");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the utensils");
        System.out.println("Switch off the microwave");
    }
}
