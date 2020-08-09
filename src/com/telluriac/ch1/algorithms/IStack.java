package com.telluriac.ch1.algorithms;

interface IStack<Item> {

    void push(Item item);

    Item pop();

    boolean isEmpty();

    int size();
}
