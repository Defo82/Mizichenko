package ru.amizichenko.chess;

import java.util.Arrays;

/**
 * Класс содержит методы предстваления доски
 * методы исплользуют друг друга и конечный вариан выглядет так
 * showField(makeBattleFront(arrangeChessMen(ChessMenAction[] row)))
 */
public class Field {

    /**
     * Метод выводит на экран переданный массив
     * @param field массив для вывода на экран
     */
    public void showField(String[][] field) {

        for (int i = 0; i < 8; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < 8; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.printf("%2s",field[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    /**
     *Метод рисует клетки на доске
     * @return возвращает массив с нарисованными клетками
     */
    public String[][] drawField() {
        String[][] drawCells = new String[8][8];
        for (int i = 0; i < drawCells.length; i++) {
            if ((i%2) == 0){
                for (int j = 0; j < drawCells.length; j++) {
                    if ((j%2) == 0){
                        drawCells[i][j] = String.format("\u2591 ");
                    } else drawCells[i][j] = String.format("\u2593 ");
                }
            } else {
                for (int j = 0; j < drawCells.length; j++) {
                    if ((j%2) == 0){
                        drawCells[i][j] = String.format("\u2593 ");
                    } else drawCells[i][j] = String.format("\u2591 ");
                }
            }

        }
        return drawCells;
    }

    /**
     * Метод рассавляет на доске белые фигуры
     * @return возвращает массив с расставленными фигуами
     */
    public String[][] arrangeChessMen(ChessMenAction[] row) {
        String[][] arranged =  new String[8][8];
        for (int i = 0; i < 16; i++) {
            arranged[Integer.parseInt(row[i].getLine())][Integer.parseInt(row[i].getColumn())] = row[i].getSign();
        }
        return arranged;
    }

    /**
     * Метод накладывает расставленные фигуры на нарисованую доску
     * @return новая ситуация
     */
    public String[][] makeBattleFront(String[][] arranged) {
        String[][] board = this.drawField();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arranged[i][j] != null) {
                board[i][j] = arranged[i][j];
                }
            }
        }
        return board;
    }


}