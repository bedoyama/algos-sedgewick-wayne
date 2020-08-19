package com.telluriac.ch1.section13;

import com.telluriac.ch1.algorithms.Stack;
import com.telluriac.stdlibrary.StdIn;
import com.telluriac.stdlibrary.StdOut;

public class InfixToPostfix {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<String> vals = new Stack<String>();
        while (!StdIn.isEmpty()) { // Read token, push if operator.
            String s = StdIn.readString();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) { // Pop, evaluate, and push result if token is ")".
                String op = ops.pop();
                String v = vals.pop();
                v = String.format("%s %s %s", vals.pop(), v, op);
                vals.push(v);
            } // Token not operator or paren: push double value.
            else vals.push(s);
        }
        StdOut.println(vals.pop());
    }

}
