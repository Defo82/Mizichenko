package ru.amizichenko.chess;

/**
 * Created by Defo on 21.07.2016.
 */
public interface Input {
    String ask(String question);
    int ask(String question, String[] range);
}
