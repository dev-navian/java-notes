package lambdas;

import java.util.function.Function;

public class LabOne {

    static Function<String, Integer> receiveCompute = operation -> {
        int a = 4;
        int b = 5;
        int result = 0;

        // switch cases for the operation
        switch (operation) {
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "power":
                result = a * b;
            default:
                System.out.println("Please enter a name of an operation");
                System.out.println("Eg: \"add\", \"subtract\", \"power\"");
        }

        return result;
    };

    public static void main(String[] args) {

        // defining variables
        int add = receiveCompute.apply("add");
        int subtract = receiveCompute.apply("subtract");
        int power = receiveCompute.apply("power");
        int none = receiveCompute.apply("");

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(power);
        System.out.println(none);

    }
}
