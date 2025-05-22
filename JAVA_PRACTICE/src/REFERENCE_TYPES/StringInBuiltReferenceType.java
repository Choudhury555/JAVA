package REFERENCE_TYPES;

public class StringInBuiltReferenceType {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(1,9));

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }

        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf('l'));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.contains("orl"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("or",7));
        System.out.println(str.endsWith("ld"));
        System.out.println(str.isEmpty());

        //equals
        System.out.println("wow".equals(("wow")));
        System.out.println("wow".equalsIgnoreCase(("wOW")));
    }
}
