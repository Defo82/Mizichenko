package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 05.10.2016.
 */
public class IteratorConvert implements Iterator {

    private Iterator<Integer> currentIterator;

    /**
     * Метод convert ничего не конвертирует. Он работает как глобальный "next" сразу для нескольких итераторов.
     * @param it это объект содержащий массив итераторов.
     * @return при каждом вызове возвращает число.
     */
    public int convert(Iterator<Iterator<Integer>> it) {
        if (currentIterator == null || !currentIterator.hasNext()) this.currentIterator = it.next();
        return this.currentIterator.next();
    }

    public boolean hasNext() {
        return false;
    }

    public Iterator<Integer> next() {
        return null;
    }
}
