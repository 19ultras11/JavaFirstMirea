package ru.mirea.task20.number1;

import ru.mirea.task6.number3.Animal;

import java.io.Serializable;

public class Generic<T extends Comparable<T>, V extends Animal & Serializable, K extends Comparable<K>> {
    private T first;
    private V second;
    private K third;

    public Generic(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("Class for T: " + first.getClass().getName());
        System.out.println("Class for V: " + second.getClass().getName());
        System.out.println("Class for K: " + third.getClass().getName());
    }
}