package ru.amizichenko.tracker.lists;

/** первый зашел, первый вышел
 * Created by Defo on 19.02.2017.
 */
public class Stack<E> extends Queue<E> {
    /**
     * записать
     * @return
     */
    private void push(E e) {
        addFirst(e);
    }

    /**
     * получить
     * @return
     */
    private E poll() {
        return getFirst();
    }
}
