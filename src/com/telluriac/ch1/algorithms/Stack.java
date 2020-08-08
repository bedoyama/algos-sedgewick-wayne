package com.telluriac.ch1.algorithms;

interface Stack<Item> {

    void push(Item item);

    Item pop();

    boolean isEmpty();

    int size();
}
