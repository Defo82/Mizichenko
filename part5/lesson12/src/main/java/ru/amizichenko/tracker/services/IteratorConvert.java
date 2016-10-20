package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 05.10.2016.
 */
public class IteratorConvert<Integer> implements Iterator {

    private int[] allResult = new int[100];
    private int index;

    public Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        int i = 0;
        while (it.hasNext()) {
            Iterator objIt = it.next();
            while (objIt.hasNext()) {
                this.allResult[i++] = (int) objIt.next();
            }
        }
        return this;
    }

    public boolean hasNext() {
        boolean result = false;
        if (this.index + 1 <= this.allResult.length) result = true;
        return result;
    }

    public Object next() {

        return this.allResult[this.index++];
    }
}
