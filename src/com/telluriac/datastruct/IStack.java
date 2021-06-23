package com.telluriac.datastruct;

public interface IStack<Item> {

    void push(Item item);

    Item pop();

    Item peek();

    boolean isEmpty();

    int size();
}
