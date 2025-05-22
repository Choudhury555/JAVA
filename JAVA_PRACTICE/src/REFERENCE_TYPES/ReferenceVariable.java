package REFERENCE_TYPES;

public class ReferenceVariable {
    public static void main(String[] args) {
        ReferenceVariable obj1 = new ReferenceVariable();
        System.out.println(obj1);
        
        ReferenceVariable obj2 = new ReferenceVariable();
        System.out.println(obj2);
        
        ReferenceVariable obj3 = null;
        System.out.println(obj3);
        obj3=obj1;
        System.out.println(obj3);

        System.out.println(obj1==obj2);
        System.out.println(obj1==obj3);
    }
}
