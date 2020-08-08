package com.telluriac.ch1.section11;

public class SquareRoot {
    public static double sqrt(double c) {
        if (c < 0.0) {
            return Double.NaN;
        }

        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            System.out.printf("before: c/t = %s%n", c/t);
            System.out.printf("before: t = %s%n", t);

            t = (c / t + t) / 2.0;

            System.out.printf("after: t = %s%n", t);
        }
        return t;
    }

}
