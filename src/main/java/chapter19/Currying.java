package chapter19;

import java.util.function.DoubleUnaryOperator;

public class Currying {
    static double converter(double x, double f, double b) {
        return x * f + b;
    }

    // => 이렇게 변화했다.

    static DoubleUnaryOperator curriedConverter(double f, double b) {
        return (double x) -> x * f + b;
    }

    static DoubleUnaryOperator curried(double b) {
        return (double f) -> f + b;
    }

    public static void main(String[] args) {
        DoubleUnaryOperator convertCtoF = curriedConverter(9.0 / 5, 32);
        DoubleUnaryOperator convertUStoGBP = curriedConverter(0.6, 0);
        DoubleUnaryOperator convertKmtoMi = curriedConverter(0.6214, 0);


        double gbp = convertCtoF.applyAsDouble(1000);
        System.out.println(gbp);

    }
}
