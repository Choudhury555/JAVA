package REFERENCE_TYPES;

public class WrapperClassPractice {
    public static void main(String[] args) {
        //WRAPPER CLASSES ARE IMMUTABLE
        //2 WAYS TO CREATE WRAPPER CLASS ((1)==>through CONSTRUCTOR(new keyword) (2)==>By using .valueOf())
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);

        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);

        System.out.println(i1==i2);//false(reference types i.e. both i1 and i2 refers to different locations with same value)
        System.out.println(i3==i4);//true(.valueOf() finds another object with same value and reuse it. So both i3 and i4 refers to same location with same value)
//        Integer i2 = new Integer("123");
    }
}
