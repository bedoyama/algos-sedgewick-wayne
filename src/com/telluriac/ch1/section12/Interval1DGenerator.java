package com.telluriac.ch1.section12;

import com.telluriac.stdlibrary.StdOut;
import com.telluriac.stdlibrary.StdRandom;

public class Interval1DGenerator {

    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        final double L = Double.parseDouble(args[1]);

        Interval1D[] Interval1DList = new Interval1D[N];

        for (int i = 0; i < N; i++) {
            double x_val = StdRandom.uniform() * L;
            double y_val = StdRandom.uniform() * L;

            Interval1DList[i] = new Interval1D(x_val, y_val);
        }

        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < N - 1; i++)
            for (int j = i + 1; j < N; j++) {
                if (Interval1DList[i].intersects(Interval1DList[j]))
                    StdOut.println(Interval1DList[i] + " intersects with " + Interval1DList[j]);
                else
                    StdOut.println(Interval1DList[i] + " does not intersect with " + Interval1DList[j]);
            }

    }
}
