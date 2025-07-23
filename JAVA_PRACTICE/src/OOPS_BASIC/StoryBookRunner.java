package OOPS_BASIC;

public class StoryBookRunner {
    public static void main(String[] args) {
        StoryBook storybook = new StoryBook(123,"JAVA BEGINNER TO ADVANCE","Abhisek");
        storybook.addReview(new Review(10,"Great Book",5));
        storybook.addReview(new Review(11,"Awesome Book",4));

        System.out.println(storybook);
    }
}
