package ru.amizichenko.chess;

/**
 * Класс содержит ошибку созданную для частного случая,
 * когда ни один ключ не соответствует введеному числу.
 */
public class MenuOutException extends RuntimeException{
    /**
     *Метод используется в ConsoleInput
     * @param msg сообщение отправляется в конструктор родительского класса
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}