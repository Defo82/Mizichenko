package ru.amizichenko.chess;

/**
 * Клетка
 */
public class Cell {

    private int line;
    private int column;

    Cell() {}
    Cell (int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
