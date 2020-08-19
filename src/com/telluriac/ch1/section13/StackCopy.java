package com.telluriac.ch1.section13;

import com.telluriac.ch1.algorithms.Stack;
import com.telluriac.stdlibrary.StdOut;

public class StackCopy {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();

        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");

        Stack<String> stringStackCopy = copy(stringStack);

        stringStack.push("E");
        stringStackCopy.push("X");

        StdOut.println("Original Stack ");
        StdOut.println(stringStack);

        StdOut.println("Stack Copy");
        StdOut.println(stringStackCopy);


    }

    private static Stack<String> copy(Stack<String> stringStack) {
        Stack<String> stringStackTmp = new Stack<String>();

        for (String item: stringStack){
            stringStackTmp.push(item);
        }

        Stack<String> stringStackCopy = new Stack<String>();

        for (String item: stringStackTmp){
            stringStackCopy.push(item);
        }

        return stringStackCopy;
    }

}
