package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 18.10.2016.
 */
public class IteratorOfIterators implements Iterator {

    private Iterator[] it;
    private int index;

public IteratorOfIterators(Iterator[] value) {
    this.it = value;
}

    public boolean hasNext() {
        boolean result = false;
            if (this.index + 1 <= this.it.length) result = true;
        return result;
    }

    public Iterator next() {

        return this.it[this.index++];
    }
}
