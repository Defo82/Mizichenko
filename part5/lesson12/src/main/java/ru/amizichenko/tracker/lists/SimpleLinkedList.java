package ru.amizichenko.tracker.lists;

import java.util.LinkedList;

/**
 * Created by Defo on 08.01.2017.
 */
public class SimpleLinkedList<E> {

    int size;
    private Wrap first;
    private Wrap last;

    public void addFirst(E e) {
        Wrap newWrap = new Wrap(first, e, last);
        this.first = newWrap;
        this.size++;
    }
    public void addLast(E e) {
        Wrap newWrap = new Wrap(first, e, last);
        this.last = newWrap;
        this.size++;
    }
    public void add(E e) {
        this.addLast(e);
    }

    public int size() {
        return this.size;
    }

    public E getFirst() {
        E item = null;
        Wrap dno = this.first;
        if (this.first != null) {
            while (dno != null) {
                item = (E) dno.item;
                dno = dno.prev;
            }
        }
        return item;
    }
    public E getLast() {
        E item = null;
        Wrap dno = this.last;
        if (this.last != null) {
            while (dno != null) {
                item = (E) dno.item;
                dno = dno.next;
            }
        }
        return item;
    }


    private static class Wrap<E> {
        E item;
        Wrap<E> next;
        Wrap<E> prev;

        Wrap(SimpleLinkedList.Wrap<E> prev, E element, SimpleLinkedList.Wrap<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }




}
