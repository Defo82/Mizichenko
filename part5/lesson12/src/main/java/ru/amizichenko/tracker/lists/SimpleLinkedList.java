package ru.amizichenko.tracker.lists;

import java.util.LinkedList;

/**
 * Created by Defo on 08.01.2017.
 */
public class SimpleLinkedList<E> {

    int size;
    private Wrap first;
    private Wrap last;

    /**
     * добавить первый элемент
     * @param e
     */
    public void addFirst(E e) {
        Wrap newWrap = new Wrap(first, e, last);
        this.first = newWrap;
        this.size++;
    }
    /**
     * добавить последний элемент
     * @param e
     */
    public void addLast(E e) {
        Wrap newWrap = new Wrap(first, e, last);
        this.last = newWrap;
        this.size++;
    }
    /**
     * дублирует addLast
     * @param e
     */
    public void add(E e) {
        this.addLast(e);
    }

    /**
     * счетчик элементов в списке
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * возвращает первый элемент списка
     * @return
     */
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
    /**
     *возвращает последний элемент списка
     * @return
     */
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

    /**
     * обертка для элементов списка
     * содержит ссылки на предыдущий и последующий элементы списка
     * @param <E>
     */
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
