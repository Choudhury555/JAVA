package REFERENCE_TYPES;

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");//MUTABLE
        sb.append("World");
        System.out.println(sb);

        sb.setCharAt(5,'w');
        System.out.println(sb);
    }
}
