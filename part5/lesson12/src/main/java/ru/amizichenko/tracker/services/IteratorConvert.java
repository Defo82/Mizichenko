package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 05.10.2016.
 */
public class IteratorConvert implements Iterator {

    private Iterator<Integer> currentIterator;

    /**
     * @param it это объект содержащий массив итераторов.
     * @return при каждом вызове возвращает один из итераторов того массива.
     */
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        if (currentIterator == null || !currentIterator.hasNext()) this.currentIterator = it.next();
        return this.currentIterator;
    }

    public boolean hasNext() {

        return this.currentIterator.hasNext();
    }

    public Integer next() {

        return this.currentIterator.next();
    }
}
