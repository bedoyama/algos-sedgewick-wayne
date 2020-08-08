package com.telluriac.ch1.section11;

import com.telluriac.stdlibrary.In;
import com.telluriac.stdlibrary.StdIn;
import com.telluriac.stdlibrary.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static int below(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return lo;
    }

    public static int[] limits(int key, int[] a) {
        int[] limits = {0, 0, 0};

        int prerank = below(key, a);

        if (a[prerank] != key) {

            limits[0] = prerank;
            limits[1] = prerank;

        } else {
            int lo = prerank;
            int hi = prerank;

            while (lo > 1 && a[lo - 1] == key) {
                lo -= 1;
            }

            while (hi < (a.length - 2) && a[hi + 1] == key) {
                hi += 1;
            }

            int count = hi - lo + 1;

            limits[0] = lo;
            limits[1] = hi;
            limits[2] = count;
        }

        return limits;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);

        for (int i = 0; i < whitelist.length; i++)
            StdOut.print(whitelist[i] + ", ");

        StdOut.println();

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();

            StdOut.println(rank(key, whitelist));
            StdOut.println(below(key, whitelist));
            StdOut.println(Arrays.toString(limits(key, whitelist)));
        }

        // Original
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//
//            if (rank(key, whitelist) != -1)
//                StdOut.println(key);
//        }

        // Print Rank
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//
//            StdOut.println(rank(key, whitelist));
//        }

        // Print Below
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//
//            StdOut.println(below(key, whitelist));
//        }
    }
}