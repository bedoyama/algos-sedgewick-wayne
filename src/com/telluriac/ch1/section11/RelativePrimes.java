package com.telluriac.ch1.section11;

import com.telluriac.stdlibrary.StdIn;
import com.telluriac.stdlibrary.StdOut;

public class RelativePrimes {

    public static void main(String[] args) {

        int size = StdIn.readInt();

        boolean[][] relatives = new boolean[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    relatives[i][i] = false;
                } else {
                    relatives[i][j] = (Euclid.gcd(i + 1, j + 1) == 1);
                    relatives[j][i] = relatives[i][j];
                }
            }

        for (int i = 0; i <= size; i++)
            StdOut.printf("%7d, ", i);
        StdOut.println();

        for (int i = 0; i < size; i++) {
            StdOut.printf("%7d, ", i + 1);
            for (int j = 0; j < size; j++) {
                StdOut.printf("%7b, ", relatives[i][j]);
            }
            StdOut.println();
        }


    }
}
