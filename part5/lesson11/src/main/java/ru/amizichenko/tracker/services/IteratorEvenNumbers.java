package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 11.09.2016.
 */
public class IteratorEvenNumbers implements Iterator {

    private final int[] values;
    private int index = 0;

    public IteratorEvenNumbers(int[] values) {
        this.values = values;
    }

    public boolean hasNext() {
        boolean check = false;
        for (int i = this.index; i < this.values.length; i++) {
            if(values[i] % 2 == 0) {
                check = true;
                break;
            } else check = false;
        }
        return check;
    }

    public Object next() {
        int evenNumber = 0;
        for (int i = this.index; i < this.values.length; i++) {
            if(values[i] % 2 == 0) {
                evenNumber = values[i];
                this.index = i+1;
                break;
            }
        }

        return evenNumber;
    }

    public void remove() {

    }
}
