package ru.amizichenko.chess;
import java.util.*;

/**
 * Created by Defo on 21.07.2016.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Переопределенный метод для выбора пункта меню
     * @param question сообщение перед вводом ключа
     * @param range массив хранящий ключи от всех пунктов меню
     * @return возвращает ключ если тот находит соответствие в массиве range
     */
    public int ask(String question, String[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (String value : range) {
            if(value.equals(key)) {
                exist = true;
                break;
            }
        }
        return key;
    }
}
