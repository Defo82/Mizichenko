package ru.amizichenko.tracker.lists;

import java.util.Arrays;

/**
 * Created by defo on 11.12.16.
 */
public class SimpleArrayList<T> {
    private Object[] simpleArray;
    private int index = 0;
    private int standardSize = 10;

    public SimpleArrayList(int size) {
        this.simpleArray = new Object[size];
    }

    public SimpleArrayList() {
        this.simpleArray = new Object[standardSize];
    }

    public boolean add(T value) {
        if (!hasNext(simpleArray)) {
            this.simpleArray = Arrays.copyOf(simpleArray, standardSize++);
        }
        this.simpleArray[index++] = value;
        return true;
    }
    public boolean update() {
        //// TODO: 13.12.16
        return false;
    }
    public boolean delete() {
        //// TODO: 13.12.16
        return false;
    }
    public T get(int id) {
        return (T) this.simpleArray[id];
    }

    /**
     * Проверка переполнения массива
     */
    private boolean hasNext(Object[] objects) {
        return objects.length < this.index;
    }
}
