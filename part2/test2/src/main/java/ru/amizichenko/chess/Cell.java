package ru.amizichenko.chess;

/**
 * Created by Defo on 03.08.2016.
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

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
