package ru.amizichenko.tracker.services;

/**
 * Created by defo on 26.11.16.
 */
public class SimpleArray<T> {

    private Object[] objects;
    private int index = 0;

    public SimpleArray(int size) {
        this.objects = new Object[size];
    }

    public void add(T value) {
        this.objects[index++] = value;
    }

    public void update(int index, T value) {
        this.objects[index] = value;
    }

    public void delete(int index) {
        /*if (index >= 0 && index < objects.length) {
            Object[] copy = new Object[objects.length-1];
            System.arraycopy(objects, 0, copy, 0, index);
            System.arraycopy(objects, index+1, copy, index, objects.length-index-1);
            this.objects = copy;
        }*/
        this.objects[index] = null;
    }

    public T get(int index) {
        return (T) this.objects[index];
    }

}