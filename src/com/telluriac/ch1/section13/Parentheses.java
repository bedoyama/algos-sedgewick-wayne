package com.telluriac.ch1.section13;

import com.telluriac.datastruct.Stack;
import com.telluriac.stdlibrary.StdOut;

public class Parentheses {

    public static void main(String[] args) {
        String expression = args[0];
        int N = expression.length();
        Stack<Character> stack = new Stack<Character>();
        boolean isBalanced = true;

        for (int i = 0; i < N; i++) {
            switch (expression.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    stack.push(expression.charAt(i));
                    break;
                case ']':
                    if (stack.isEmpty() || (stack.pop()!='['))
                        isBalanced = false;
                    break;
                case ')':
                    if (stack.isEmpty() || (stack.pop()!='('))
                        isBalanced = false;
                    break;
                case '}':
                    if (stack.isEmpty() || (stack.pop()!='{'))
                        isBalanced = false;
                    break;

            }
        }

        if (isBalanced && !stack.isEmpty())
            isBalanced = false;

        StdOut.println("Expression is " + expression);

        if (isBalanced) StdOut.println("Expression is balanced");
        else StdOut.println("Expression is not balanced");
    }
}
