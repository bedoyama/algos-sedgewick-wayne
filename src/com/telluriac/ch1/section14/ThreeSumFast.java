package com.telluriac.ch1.section14;

import com.telluriac.ch1.section11.BinarySearch;
import com.telluriac.stdlibrary.In;
import com.telluriac.stdlibrary.StdOut;

import java.util.Arrays;
public class ThreeSumFast
{
    public static int count(int[] a)
    { // Count triples that sum to 0.
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j < N; j++)
                if (BinarySearch.rank(-a[i]-a[j], a) > j)
                    cnt++;
        return cnt;
    }
    public static void main(String[] args)
    {
        int[] a = In.readInts(args[0]);
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();
        StdOut.println(count + " triples " + time + "seconds");
    }
}