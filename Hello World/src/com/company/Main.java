package com.company;

public class Main {

    String[][] field = new String[8][8];

    public void showField() {

        for (int i = 0; i < 8; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            for (int j = 0; j < 8; j++) {
                // Используем оператор print - без перехода на следующую строку
                System.out.print(this.field[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public void fillField() {

        for (int i = 0; i < field.length; i++) {
            if ((i%2) == 0){
                for (int j = 0; j < field.length; j++) {
                    if ((j%2) == 0){
                        field[i][j] = String.format("\u2591 ");
                    } else field[i][j] = String.format("\u2593 ");
                }
            } else {
                for (int j = 0; j < field.length; j++) {
                    if ((j%2) == 0){
                        field[i][j] = String.format("\u2593 ");
                    } else field[i][j] = String.format("\u2591 ");
                }
            }

        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.fillField();


        for (int i = 6; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                main.field[i][j] = "\u2659 ";
            }
            break;
        }
        String[] wRow = {"\u2656 ","\u2658 ","\u2657 ","\u2655 ","\u2654 ","\u2657 ","\u2658 ","\u2656 ",};

        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                main.field[i][j] = wRow[j];
            }
            break;
        }


        main.showField();

    }

}