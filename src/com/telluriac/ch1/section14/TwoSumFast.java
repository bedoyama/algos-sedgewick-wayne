package com.telluriac.ch1.section14;

import com.telluriac.ch1.section11.BinarySearch;
import com.telluriac.stdlibrary.In;
import com.telluriac.stdlibrary.StdOut;

import java.util.Arrays;
public class TwoSumFast
{
    public static int count(int[] a)
    { // Count pairs that sum to 0.
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            if (BinarySearch.rank(-a[i], a) > i)
                cnt++;
        return cnt;
    }
    public static void main(String[] args)
    {
        int[] a = In.readInts(args[0]);
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();
        StdOut.println(count + " pairs " + time + "seconds");
    }
}