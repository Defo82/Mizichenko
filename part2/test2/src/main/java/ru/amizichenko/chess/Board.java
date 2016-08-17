package ru.amizichenko.chess;

/**
 * Доска с фигурами
 * Методы проверяют условия из Figure
 */
public class Board {

    public Figure[][] figures = new Figure[8][8];

    /**
     * Метод проверяет корректен ли ход для данной фигуры
     * @param way массив с клетками на которые можно пойти
     * @param distance ход пользователя
     * @return разрешение ходить
     */
    public boolean checkCorrectFiguresWay(Cell[] way, Cell distance) {
        boolean allow = false;
        for (int i = 0; i < way.length; i++) {
            if (way[i] != null && (way[i].getLine() == distance.getLine() && way[i].getColumn() == distance.getColumn())) {
                allow = true;
            } else System.out.println("Фигура не может так пойти");
        }
        return allow;
    }

    /**
     * Метод проверяет свободен ли путь
     * @param way клетки составляющие путь от фигуры до хода пользователя
     * @return разрешение ходить
     */
    public boolean checkClearWayTo(Cell[] way) {
        boolean allow = true;
        for (Cell cellOfWay : way) {
            if (figures[cellOfWay.getLine()][cellOfWay.getColumn()] != null) {
                allow = false;
            }
        }
        return allow;
    }



}


