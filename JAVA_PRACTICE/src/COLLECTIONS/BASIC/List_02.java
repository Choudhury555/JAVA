package COLLECTIONS.BASIC;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_02 {
    //NOTE=====>
    //When the List is created by using .of() method then that List becomes immutable
    //To create mutable List we can use (ArrayList,LinkedList,Vector)
    public static void main(String[] args) {
        List<String> words = List.of("Apple","Bat","Cat");//words is immutable
        //words.add("Dog");//This will give error (ImmutableCollections)

        List<String> wordsArrayList = new ArrayList<>(words);//Now words is mutable
        wordsArrayList.add("Dog");
        System.out.println(wordsArrayList);


        List<String> wordsLinkedList = new LinkedList<>(words);//Now words is mutable
        wordsLinkedList.add("Elephant");
        System.out.println(wordsLinkedList);


        List<String> wordsVector= new Vector<>(words);//Now words is mutable
        wordsVector.add("Zebra");
        System.out.println(wordsVector);
    }
}
