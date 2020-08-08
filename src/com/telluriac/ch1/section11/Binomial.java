package com.telluriac.ch1.section11;

import com.telluriac.stdlibrary.StdOut;

public class Binomial {
    public static double binomial(int N, int k, double p) {
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;
        return (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double binomialKernel(int N, int k, double p, double[][] scratchpad) {
        if ((N < 0) || (k < 0)) return 0.0;

        if (scratchpad[N][k] != -1.0) {
            return scratchpad[N][k];
        } else {
            if ((N == 0) && (k == 0)) {
                scratchpad[N][k] = 1.0;
                return scratchpad[N][k];
            }
            scratchpad[N][k] = (1 - p) * binomialKernel(N - 1, k, p, scratchpad) + p * binomialKernel(N - 1, k - 1, p, scratchpad);
            return scratchpad[N][k];
        }
    }

    public static double binomialWithMemoization(int N, int k, double p) {
        double[][] scratchpad = new double[N + 1][k + 1];

        for (int i=0;i<N+1;i++)
            for (int j=0;j<k+1;j++)
                scratchpad[i][j] = -1.0;

        return binomialKernel(N, k, p, scratchpad);
    }

    public static void main(String[] args) {
        StdOut.println(binomialWithMemoization(10, 5, 0.5));
        StdOut.println(binomialWithMemoization(20, 10, 0.5));
        StdOut.println(binomialWithMemoization(100, 50, 0.5));
        StdOut.println(binomial(10, 5, 0.5));
        StdOut.println(binomial(20, 10, 0.5));
        StdOut.println(binomial(100, 50, 0.5));
    }
}
