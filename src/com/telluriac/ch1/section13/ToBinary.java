package com.telluriac.ch1.section13;

import com.telluriac.datastruct.Stack;
import com.telluriac.stdlibrary.StdOut;

public class ToBinary {
    public static void main(String[] args){
        long N = Long.parseLong(args[0]);

        Stack<Integer> stack = new Stack<Integer>();
        while (N > 0)
        {
            stack.push((int) (N % 2));
            N = N / 2;
        }
        for (int d : stack) StdOut.print(d);
        StdOut.println();
    }
}
