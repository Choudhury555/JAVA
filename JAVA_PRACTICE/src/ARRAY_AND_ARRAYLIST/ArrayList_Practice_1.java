package ARRAY_AND_ARRAYLIST;

import java.util.ArrayList;

public class ArrayList_Practice_1 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Apple");
        arrList.add("Orange");
        arrList.add("Banana");

        System.out.println(arrList);

        arrList.remove("Orange");

        System.out.println(arrList);

        arrList.remove(0);
        System.out.println(arrList);
    }
}
