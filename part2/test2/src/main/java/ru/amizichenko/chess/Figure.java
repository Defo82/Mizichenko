package ru.amizichenko.chess;

/**
 * Абстрактная Фигура
 *
 */
public abstract class Figure{

    Figure() {}
    Figure(Cell position) {
        this.position = position;
    }

    protected boolean sideOfColor = true; //true white, false black
    public Cell position;

    //Методы - условия
    public abstract Cell[] conditionClearWayTo(Cell distance);
    public abstract Cell[] conditionCorrectFiguresWay(Cell distance);


    /**
     * Метод перемещает фигуру
     * @param distance Клетка на которую нужно переместить фигуру
     */
    public void figureGo(Cell distance, boolean correct, boolean clear) {
        if (correct && clear) {
            this.position = new Cell(distance.getLine(), distance.getLine());
        } else System.out.println("Фигуру переместить нельзя");
    }

}
