package com.telluriac.ch1.algorithms;

import com.telluriac.datastruct.IQueue;

import java.util.Iterator;

public class ResizingArrayQueue<Item> implements IQueue<Item> {
    private static int mincap = 2;
    private int capacity = mincap;
    private Item[] a = (Item[]) new Object[capacity]; // queue items
    private int head = 0; // where to enqueue items
    private int tail = 0; // where to dequeue items
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return (size) == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void resize(int max) { // Move queue to a new array of size max.
        Item[] temp = (Item[]) new Object[max];

        if (head > tail) {
            for (int i = tail; i < head; i++) {
                temp[i - tail] = a[i];
            }
        } else {
            for (int i = tail; i < capacity; i++) {
                temp[i - tail] = a[i];
            }
            for (int i = 0; i < head; i++) {
                temp[i + capacity - tail] = a[i];
            }
        }

        head = size;
        tail = 0;
        capacity = max;
        a = temp;
    }

    @Override
    public void enqueue(Item item) { // Add item to head of queue.
        if (size == capacity) resize(capacity * 2);

        a[head++] = item;
        size++;
        if (head == capacity) head = 0;
    }

    @Override
    public Item dequeue() { // Remove item from tail of queue.
        Item item = a[tail++];
        size--;
        if (tail == capacity) tail = 0;

        if (size < (capacity / 4)) resize(Math.max(capacity / 2, mincap));

        return item;
    }

    public Iterator<Item> iterator() {
        return new FordwardArrayIterator();
    }

    private class FordwardArrayIterator implements Iterator<Item> { // Support FIFO iteration.
        private int i = tail;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {
        }
    }
}
