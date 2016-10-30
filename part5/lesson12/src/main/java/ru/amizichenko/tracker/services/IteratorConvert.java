package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 05.10.2016.
 */
public class IteratorConvert implements Iterator {

    private Iterator<Iterator<Integer>> it;
    private Iterator<Integer> currentIterator;

    /**
     * Передает ссылку на массив итераторов в объект текущего класса.
     * @param it это объект содержащий массив итераторов.
     * @return возвращает объект текущего класса.
     */
    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.it = it;
        return this;
    }

    public boolean hasNext() {
        boolean result = this.it.hasNext();
        if (!result) result = this.currentIterator.hasNext();
        return result;
    }

    public Integer next() {
        if (currentIterator == null || !currentIterator.hasNext()) this.currentIterator = it.next();
        return this.currentIterator.next();
    }
}
