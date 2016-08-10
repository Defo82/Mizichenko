package ru.amizichenko.chess;

/**
 * Абстрактная Фигура
 */
public abstract class Figure{

    Figure() {}
    Figure(Cell position) {
        this.position = position;
    }

    protected boolean sideOfColor = true; //true white, false black
    public Cell position;


    public abstract Cell[] move(Cell distance);

    /**
     * Метод перемещает фигуру
     * @param distance Клетка на которую нужно переместить фигуру
     * @param allow Разрешение переметить фигуру
     */
    public void figureGo(Cell distance, boolean allow) {
        if (allow) {
            this.position = new Cell(distance.getLine(), distance.getLine());
        } else {
            System.out.println("Фигура не может туда пойти. ");
        }
    }

}
