package com.telluriac.ch1.section13;

import com.telluriac.datastruct.Queue;
import com.telluriac.datastruct.Stack;
import com.telluriac.stdlibrary.StdOut;

public class ReverseQueue {
    public static void main(String[] args){
        Queue<String> q = new Queue<String>();

        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        StdOut.println("Original");
        StdOut.println(q);

        Stack<String> stack = new Stack<String>();
        while (!q.isEmpty())
            stack.push(q.dequeue());
        while (!stack.isEmpty())
            q.enqueue(stack.pop());

        StdOut.println("Reversed");
        StdOut.println(q);

    }
}
