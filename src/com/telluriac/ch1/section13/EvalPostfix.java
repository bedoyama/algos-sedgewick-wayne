package com.telluriac.ch1.section13;

import com.telluriac.ch1.algorithms.Stack;
import com.telluriac.stdlibrary.StdIn;
import com.telluriac.stdlibrary.StdOut;

public class EvalPostfix {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()) { // Read token, push if operator.
            String s = StdIn.readString();
            double v;

            switch (s.charAt(0)) {
                case '+':
                    v = vals.pop();
                    v = vals.pop() + v;
                    vals.push(v);
                    break;
                case '-':
                    v = vals.pop();
                    v = vals.pop() - v;
                    vals.push(v);
                    break;
                case '*':
                    v = vals.pop();
                    v = vals.pop() * v;
                    vals.push(v);
                    break;
                case '/':
                    v = vals.pop();
                    v = vals.pop() / v;
                    vals.push(v);
                    break;
                default:
                    vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }

}
