package ru.amizichenko.chess;

/**
 * Created by Defo on 19.07.2016.
 */
public class StartGame {
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        ChessMen chessMen = new ChessMen();
        Field field = new Field();
        MenuChessMen menu = new MenuChessMen();

        chessMen.setupRowItems();

        do {
            field.showField(field.makeBattleFront(field.arrangeChessMen(chessMen.getRowItems())));

            System.out.println(chessMen.getRowItems()[0].getCellPosition());
            menu.show(chessMen.getRowItems());
            chessMen.select(input.ask("Select chess man", chessMen.getRangeActions()));
            System.out.println(chessMen.getRowItems()[0].getCellPosition());

        } while (!"y".equals(input.ask("to exit press y  ")));

    }
}
