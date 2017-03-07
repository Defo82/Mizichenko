package ru.amizichenko.tracker.set;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by Defo on 28.02.2017.
 */
public class SimpleSet<E> implements Iterator<E> {

    public SimpleSet(int size) {
        this.values = new Object[size];
    }

    /**
     * массив уникальных объектов
     */
    public Object[] values;
    private int index = 0;
    private int iterIndex = 0;

    /**
     * добавляет уникальный объект в массив
     * @param e новый элемент массива
     */
    public void add(E e) {
        boolean duplicate = false;

        for (Object a : this.values) {
            if (a != null && a.equals(e)) {
                duplicate = true;
                break;
            }
        }
        if (!duplicate) values[index++] = e;
    }

    /**
     * "следующий есть" при условии, что массив больше текущего значения и значение не равно нулю
     * @return true, если условие выполнено
     */
    @Override
    public boolean hasNext() {
        return (values.length > this.iterIndex && values[this.iterIndex] != null);
    }

    @Override
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
        throw new NoSuchElementException();
    }
        return (E) values[iterIndex++];
    }
}
