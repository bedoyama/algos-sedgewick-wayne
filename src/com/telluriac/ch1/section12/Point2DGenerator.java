package com.telluriac.ch1.section12;

import com.telluriac.stdlibrary.StdIn;
import com.telluriac.stdlibrary.StdOut;
import com.telluriac.stdlibrary.StdRandom;

public class Point2DGenerator {

    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);

        Point2D[] point2DList = new Point2D[N];

        for (int i = 0; i < N; i++) {
            double x_val = StdRandom.uniform();
            double y_val = StdRandom.uniform();

            point2DList[i] = new Point2D(x_val, y_val);
        }

        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < N - 1; i++)
            for (int j = i + 1; j < N; j++) {
                if (Point2D.distance(point2DList[i],point2DList[j]) < minDistance)
                    minDistance = Point2D.distance(point2DList[i],point2DList[j]);
            }

        StdOut.printf("Minimum distance found was: %f", minDistance);

    }

}
