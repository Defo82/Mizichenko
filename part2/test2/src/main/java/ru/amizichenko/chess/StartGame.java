package ru.amizichenko.chess;

/**
 * Created by Defo on 04.08.2016.
 */
public class StartGame {



    public static void main(String[] args) {
        Cell pawn = new Cell(6, 0);
        Cell distance = new Cell(4, 0);
        Figure figure = new Figure(pawn);
        Board board = new Board();

        figure.figureGo(distance, board.checkWay(figure.movePawn(distance)));

        System.out.print(figure.position.getLine());
        System.out.println(figure.position.getColumn());
    }
}
