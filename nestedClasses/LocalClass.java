package nestedClasses;

public class LocalClass {

    public void printSomething() {
        String value = "hello Print";
        System.out.println("Printing something out k3k3");

        // local class (limited to its block scope)
        class Local {
            private int localVar = 23;

            // regular method in the local member class
            void printLocalVar() {
                System.out.println("Here is the method's variable: " + value);
            }
        }

        Local localMember = new Local();

        System.out.println(localMember.localVar);
        localMember.printLocalVar();
    }

    // main method
    public static void main(String[] args) {

        LocalClass lClass = new LocalClass();

        lClass.printSomething();

    }
}
