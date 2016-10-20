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
        boolean resoult = false;
        for (int i = this.index; i < it.length; i++) {
            if (it[i] != null) resoult = true;
            break;
        }
        return resoult;
    }

    public Iterator next() {

        return this.it[index++];
    }
}
