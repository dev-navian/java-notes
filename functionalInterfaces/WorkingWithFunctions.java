package functionalInterfaces;

import java.util.function.Function;

// double it class
class DoubleIt implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 2;
    }
}

// square it class
class SquareIt implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

// half it class
class halfIt implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer / 2;
    }
}


public class WorkingWithFunctions {
    public static int runApp(int number, Function<Integer, Integer> functionName) {
        return functionName.apply(number);
    }

    public static void main(String[] args) {
        System.out.println(new DoubleIt().apply(3));
        System.out.println();
        System.out.println(runApp(3, new DoubleIt()));
        System.out.println(runApp(3, new SquareIt()));
        System.out.println();
        System.out.println(new halfIt().apply(113));
    }

}
