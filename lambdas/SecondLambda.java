package lambdas;

import java.util.function.Function;

public class SecondLambda {

    static Function<String, String> printUpper = name -> name.toUpperCase();

    static Function<String, Integer> printLength = name -> name.length();


    public static void main(String[] args) {
        System.out.println(printUpper.apply("Jenna"));
        System.out.println(printLength.apply("Arturo Artelio"));
    }


}
