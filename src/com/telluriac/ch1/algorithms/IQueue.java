package com.telluriac.ch1.algorithms;

interface IQueue<Item> {
    boolean isEmpty();

    int size();

    void enqueue(Item item);

    Item dequeue();
}
