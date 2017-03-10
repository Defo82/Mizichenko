package ru.amizichenko.tracker.set;

/**
 * Created by root on 10.03.17.
 */
public class SimpleLinkedSet<E> {

    private Wrap<E> first;
    private Wrap<E> last;
    private int size;

    public void add() {

    }

    private boolean checkDuplicate() {
        return false;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>();
    }



        private class Wrap<E> {
            Wrap<E> pre;
            Wrap<E> current;
            Wrap<E> next;
        }

        private class Iterator<E> implements java.util.Iterator<E> {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        }
}
