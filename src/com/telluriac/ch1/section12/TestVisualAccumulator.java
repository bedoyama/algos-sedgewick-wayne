package com.telluriac.ch1.section12;

import com.telluriac.stdlibrary.StdOut;
import com.telluriac.stdlibrary.StdRandom;

public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}