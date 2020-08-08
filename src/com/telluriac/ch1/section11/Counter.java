package com.telluriac.ch1.section11;

public class Counter {
    private String id;
    private long value;

    Counter(String id) {
        this.id = id;
        this.value = 0;
    }

    void increment() {
        value++;
    }

    long tally() {
        return value;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id='" + id + '\'' +
                ", value=" + value +
                '}';
    }
}
