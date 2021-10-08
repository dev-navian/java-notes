package lambdas;

import java.util.function.Function;

public class LabTwo {

    static Function<Integer, Integer> addFirst = numOne -> numOne + 2;

    // static Function<Integer, Integer> addSecond = numTwo -> numTwo + 3;

    static Function<Integer, Integer> addSecond = numTwo -> {
        return addFirst.apply(numTwo);
    };

    public static void main(String[] args) {

    }
}
