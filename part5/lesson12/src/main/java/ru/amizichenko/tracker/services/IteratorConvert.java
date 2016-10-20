package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 05.10.2016.
 */
public class IteratorConvert implements Iterator {

    Iterator<Iterator<Integer>> it;
    Iterator<Integer> position;

    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.it = it;
        return this;
    }

    public boolean hasNext() {
        return it.hasNext() || (position != null && position.hasNext());
    }

    public Integer next() {
        if(position == null) {
            position = it.next();
        }else if (!position.hasNext()) {
            position = it.next();
        }
        return position.next();
    }
}
