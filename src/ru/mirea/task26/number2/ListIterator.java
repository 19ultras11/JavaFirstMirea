package ru.mirea.task26.number2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator<E> implements Iterator<E> {
    private List<E> list;
    private int currentIndex;

    public ListIterator(List<E> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return list.get(currentIndex++);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");

        ListIterator<String> iterator = new ListIterator<>(stringList);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
