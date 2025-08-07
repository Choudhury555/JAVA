package COLLECTIONS.BASIC;

import java.util.List;

public class List_01 {
    public static void main(String[] args) {
        List<String> words = List.of("Apple","Bat","Cat");
        System.out.println(words);//[Apple, Bat, Cat]
        System.out.println(words.size());//3
        System.out.println(words.isEmpty());//false
        System.out.println(words.get(1));//Bat
        System.out.println(words.contains("Cat"));//true
        System.out.println(words.indexOf("Cat"));//2
        System.out.println(words.indexOf("Dog"));//-1

        //When the List is created by using .of() method then that List becomes immutable
        //To create mutable List we can use (ArrayList,LinkedList,Vector)

    }
}
