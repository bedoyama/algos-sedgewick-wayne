package com.telluriac.ch1;

import com.telluriac.stdlibrary.StdOut;
import com.telluriac.stdlibrary.StdRandom;

public class TestAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}