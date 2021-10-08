package nestedClasses;

// Anonymous classes are like local classes, but without an actual name given to it
// Extends an already existing class

class ToBeInherited {
    public void sayHello() {
        System.out.println("Hello dear friend");
    }
}


public class AnonymousClass {

    public void someMethod() {
        int someVariable = 344;
        System.out.println("This is the anonymous parent class' method");

        // anonymous class
        ToBeInherited inherit = new ToBeInherited() {
            // overridden inherited method
            @Override
            public void sayHello() {
                System.out.println("Hello my loved one");
            }

            public void printVariable() {
                System.out.println("My parent's variable: " + someVariable);
            }
        };

        inherit.sayHello();
    }


    public static void main(String[] args) {
        AnonymousClass anonym = new AnonymousClass();
        anonym.someMethod();

    }

}
