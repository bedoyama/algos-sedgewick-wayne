package com.telluriac.ch1.algorithms;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>, IStack<Item> {
    private Node first; // top of stack (most recently added node)
    private int N; // number of items

    private class Node { // nested class to define nodes
        Item item;
        Node next;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public void push(Item item) { // Add item to top of stack.
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    @Override
    public Item pop() { // Remove item from top of stack.
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Item peek() {
        return first.item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    @Override
    public String toString() {
        String representation = "";

        for (Item item : this) {
            representation += item + " ";
        }

        return "Stack{ top " +
                representation +
                ",N=" + N + '}';
    }
}