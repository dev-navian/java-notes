package nestedClasses;

class Outer {
    int a = 0;

    // member class
    class Inner {
        boolean isHuge = false;
    }

    // static inner class
    static class AnotherInner {
        boolean isInnermost = false;
    }
}


public class NestedClass {

    public static void main (String[] args) {
        Outer outerClass = new Outer();

        // (inner) member class
        Outer.Inner innerClass = outerClass.new Inner();

        // static inner class
        Outer.AnotherInner anotherInner = new Outer.AnotherInner();

        System.out.println(outerClass.a);
        System.out.println(innerClass.isHuge);
        System.out.println(anotherInner.isInnermost);
    }
}