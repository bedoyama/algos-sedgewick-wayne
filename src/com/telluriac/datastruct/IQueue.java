package com.telluriac.datastruct;

public interface IQueue<Item> {
    boolean isEmpty();

    int size();

    void enqueue(Item item);

    Item dequeue();
}
