package ru.amizichenko.tracker.lists;

/** последний зашел, первый вышел
 * Created by Defo on 19.02.2017.
 */
public class Queue<E> extends SimpleLinkedList<E> {
    /**
     * вставить в очередь
     * @return
     */
    private void enQue(E e) {
        addLast(e);
    }

    /**
     * получить первого из очереди
     * @return
     */
    private E deQue() {
        return getFirst();
    }
}
