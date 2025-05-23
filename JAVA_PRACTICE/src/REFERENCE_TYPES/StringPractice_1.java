package REFERENCE_TYPES;

public class StringPractice_1 {
    public static void main(String[] args) {
        String str = "Hello";//IMMUTABLE
        System.out.println(str.concat("World"));//HelloWorld
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.toLowerCase());//hello

        String str_1 = "   WOW   ";//IMMUTABLE
        System.out.println(str_1);
        System.out.println(str_1.trim());

        System.out.println("1"+"2");//12
        System.out.println("1"+2);//12
        System.out.println(2+5+"3");//73
        System.out.println("2"+5+3);//253

        System.out.println("Number is " + 20 + 25);//Number is 2025
        System.out.println("Number is " + (20 + 25));//Number is 45

        System.out.println(String.join(",","A","B","C"));//A,B,C
        System.out.println(str.replace("H","WOW"));
    }
}
