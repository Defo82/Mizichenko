package ru.amizichenko.chess;

/**
 * Created by Defo on 19.07.2016.
 * Абстрактный класс для объектов фигур
 */
abstract class ChessMenAction {
    private String name;
    private boolean alive = true;
    private String line;
    private String column;
    private String sign;

    ChessMenAction(String name, String sign, String line, String column) {
        this.name = name;
        this.sign = sign;
        this.line = line;
        this.column = column;
    }


    public abstract void execute();

    public String info() {
        return String.format("\t%s. %s %s", String.format("%s%s",this.line,this.column),sign, this.name);
    }

    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setCellPosition(String cell) {
        char[] arr = cell.toCharArray();
        this.line = Character.toString(arr[0]);
        this.column = Character.toString(arr[1]);
    }
    public String getCellPosition() {
        return this.line + this.column;
    }

    public String getName() {
        return this.name;
    }
    public String getSign() {
        return this.sign;
    }

    public String getLine() {
        return this.line;
    }
    public String getColumn() {
        return this.column;
    }


}
