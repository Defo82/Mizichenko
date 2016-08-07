package ru.amizichenko.chess;

/**
 * Фигура
 */
public class Figure{
    /**
     *
     */
    private boolean sideOfColor = true; //true white, false black
    public Cell position;
    private Cell distance;


    Figure(Cell position) {
        this.position = position;
    }

    /**
     * Метод возвращает путь для пешки
     * @param distance клетка на которую нужно пойти
     * @return массив клеток от текущего положения фигуры до distance
     */
    public Cell[] movePawn(Cell distance) {
        this.distance = distance;

        Cell[] way = new Cell[2];
        int distLine = distance.getLine(); // для инкремента

        if (sideOfColor) {
            while(this.position.getLine() != distLine) {
                for (int i = 0; i < way.length; i++) {
                    way[i] = new Cell(distLine++, distance.getColumn());
                }
            }
        } else {
            while(this.position.getLine() != distLine) {
                for (int i = 0; i < way.length; i++) {
                    way[i] = new Cell(distLine--, distance.getColumn());
                }
            }
        }

        return way;

    }

    /**
     * Метод перемещает фигуру
     * @param distance Клетка на которую нужно переместить фигуру
     * @param allow Разрешение переметить фигуру
     */
    public void figureGo(Cell distance, boolean allow) {
        if (allow) {
            this.position = new Cell(distance.getLine(), distance.getColumn());
        } else {
            System.out.println("Фигура не может туда пойти. ");
        }
    }

}
