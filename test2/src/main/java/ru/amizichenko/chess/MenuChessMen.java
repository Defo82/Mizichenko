package ru.amizichenko.chess;

/**
 * Created by Defo on 20.07.2016.
 */
public class MenuChessMen extends ChessMen{


    /**
     * Показывает фигуры доступные на доске
     * @param actions
     */
    public void show(ChessMenAction[] actions) {
        System.out.printf("\nIt's your turn to go now.");
        for(ChessMenAction act : actions) {
            if (act != null) {
                if (act.getName().equals("Pawn")) System.out.print(act.info());
            }
        }
        System.out.println();

        for(ChessMenAction act : actions) {
            if (act != null) {
                if (act.getName().equals("Rook")) System.out.print(act.info());
            }
        }
        System.out.println();

        for(ChessMenAction act : actions) {
            if (act != null) {
                if (act.getName().equals("Knight")) System.out.print(act.info());
            }
        }
        System.out.println();

        for(ChessMenAction act : actions) {
            if (act != null) {
                if (act.getName().equals("Bishop")) System.out.print(act.info());
            }
        }
        System.out.println();

        for(ChessMenAction act : actions) {
            if (act != null) {
                if (act.getName().equals("Queen")) System.out.print(act.info());
            }
        }
        System.out.println();

        for(ChessMenAction act : actions) {
            if (act != null) {
                if (act.getName().equals("King")) System.out.print(act.info());
            }
        }
        System.out.println();
    }
}
