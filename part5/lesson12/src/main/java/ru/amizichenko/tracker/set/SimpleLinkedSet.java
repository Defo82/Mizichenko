package ru.amizichenko.tracker.set;

/**
 * Created by root on 10.03.17.
 */
public class SimpleLinkedSet<E> {

    private Wrap<E> first;
    private Wrap<E> last;
    private int size;

    /**
     * Добавить новый объект в список уникальных элементов
     * @param e новый элемент
     */
    public void add(E e) {
        if (!checkDuplicate(e)) {
            if (this.first == null) {
                this.first = this.last = new Wrap<>(null, e, null );
            } else {
                Wrap<E> shift = this.last;
                this.last = new Wrap<>(shift, e, null);
                shift.next = this.last;
            }
        }
    }

    /**
     * Проверить объект на уникальность
     * @param e новый объект
     * @return true если найдено совпадение
     */
    private boolean checkDuplicate(E e) {
        boolean check = false;
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(e)) check = true;
        }
        return check;
    }

    /**
     * Возвращает объект итератора
     * @return
     */
    public Iterator<E> iterator() {
        return new Iterator<E>();
    }


    /**
     * Обертка для элемента
     * Так же содержит ссылки на предыдущий и следующий объекты
     * @param <E>
     */
        private class Wrap<E> {
            Wrap<E> pre;
            E current;
            Wrap<E> next;

            Wrap(Wrap<E> pre, E current, Wrap<E> next){
                this.pre = pre;
                this.current = current;
                this.next = next;

            }
        }

    /**
     * Итератор
     * @param <E>
     */
        private class Iterator<E> implements java.util.Iterator<E> {
            private Wrap<E> lastElement = (Wrap<E>) first;
            private int iterIndex = 0;

            @Override
            public boolean hasNext() {
                return iterIndex < size;
            }

            @Override
            public E next() {
                Wrap<E> element = lastElement;
                lastElement = element.next;
                return (E) element;
            }
        }
}
