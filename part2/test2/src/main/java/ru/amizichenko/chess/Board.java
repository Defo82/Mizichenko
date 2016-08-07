package ru.amizichenko.chess;

/**
 * Доска с фигурами
 */
public class Board {

    public Figure[][] figures = new Figure[8][8];

    /**
     * Метод проверяет свободен ли путь
     * @param way Путь от фигуры до клетки на которую нужно пойти
     * @return Возвращает разрешение на перемещение
     */
    public boolean checkWay(Cell[] way) {
        boolean allow = true;
        for (Cell cellOfWay : way) {
            if (figures[cellOfWay.getLine()][cellOfWay.getColumn()] != null) {
                allow = false;
            }
        }
        return allow;
    }



}


