package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 18.10.2016.
 */
public class IteratorOfIterators implements Iterator<Iterator<Integer>> {

    private Iterator<Integer>[] it;
    private int index = 0;

    public IteratorOfIterators(Iterator[] value) {
        this.it = value;
    }

    public boolean hasNext() {
        boolean result = false;
            if (this.index + 1 <= this.it.length) result = true;
        return result;
    }

    public Iterator<Integer> next() {
        Iterator<Integer> next = this.it[this.index];
        this.index++;
        return next;
    }
}
