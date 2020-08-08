package com.telluriac.ch1.section11;

import com.telluriac.stdlibrary.StdOut;

public class Fibonacci {
    public static long fiboBruteForce(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fiboBruteForce(N - 1) + fiboBruteForce(N - 2);
    }

    public static long fiboLoopSaveMem(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        long cnt = 2;
        long prev = 1;
        long prevprev = 1;
        long last = -1;

        while (cnt <= N) {
            last = prev + prevprev;

            prevprev = prev;
            prev = last;

            cnt++;
        }

        return last;
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + fiboLoopSaveMem(N));
    }
}