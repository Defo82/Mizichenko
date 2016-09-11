package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 11.09.2016.
 */
public class IteratorArray implements Iterator {

    private final int[] values;
    private int index = 0;

    public IteratorArray(final int[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        return values.length < index;
    }

    public Object next() {
        return values[index++];
    }

    public void remove() {

    }
}
