package functions;

import java.util.function.Function;

public class FirstFunction {

    public static void main(String[] args) {
        int incrementForMethod = incrementByOne(4);
        int incrementForFunction = incrementByOneFunction.apply(4);
        int multiplyForFunction = multiplyByTenFunction.apply(3);

        System.out.println(incrementForMethod);
        System.out.println(incrementForFunction);
        System.out.println(multiplyForFunction);

        // composing functions
            // and then
        Function<Integer, Integer> incrementAndMultiply = incrementByOneFunction.andThen(multiplyByTenFunction);
        int finalMathOp = incrementAndMultiply.apply(3);
        System.out.println(finalMathOp);

            // compose
        Function<Integer, Integer> composeBoth = multiplyByTenFunction.compose(incrementByOneFunction); // increment before multiply
        System.out.println(composeBoth.apply(7));

    }

    // regular Java method definition
    static int incrementByOne(int number) {
        return number+ 1;
    }

    // function style in Java
    // <Integer, Integer>
    // the first Integer represents the type of the argument (takes a/an)
    // the second Integer represents the return type of the function (returns a/an)
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

}
