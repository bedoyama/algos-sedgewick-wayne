package com.telluriac.ch1;

import com.telluriac.stdlibrary.StdOut;

public class Euclid {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        StdOut.println(Euclid.gcd(10, 25));
        StdOut.println(Euclid.gcd(5, 3));
        StdOut.println(Euclid.gcd(1322, 2312));
        StdOut.println(Euclid.gcd(231, 2212));
    }
}
