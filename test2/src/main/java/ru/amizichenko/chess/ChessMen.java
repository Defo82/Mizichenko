package ru.amizichenko.chess;

/**
 * Created by Defo on 19.07.2016.
 * Классы фигур
 */
public class ChessMen {

/**
 * В массиве rowItems хранятся фигуры которые в данный момент находятся на доске
 */
    private ChessMenAction[] rowItems = new ChessMenAction[16];
    public ChessMenAction[] getRowItems() {
        return this.rowItems;
    }
    public ChessMenAction[] setupRowItems() {
        for (int i = 0; i < 8; i++) {
            this.rowItems[i] = this.new Pawn("6", Integer.toString(i));
	}

         this.rowItems[8] = this.new Rook("7", "0");
         this.rowItems[9] = this.new Knight("7", "1");
        this.rowItems[10] = this.new Bishop("7", "2");
        this.rowItems[11] = this.new Queen();
        this.rowItems[12] = this.new King();
        this.rowItems[13] = this.new Bishop("7", "5");
        this.rowItems[14] = this.new Knight("7", "6");
        this.rowItems[15] = this.new Rook("7", "7");
        return this.rowItems;
    }

    public  void select(String key) {
        this.rowItems[key].execute();
    }

    public String[] getRangeActions() {
        String[] arr = new String[this.rowItems.length];
        for (int i = 0; i < this.rowItems.length; i++) {
            arr[i] = rowItems[i].getCellPosition();
        }
        return arr;
    }


    public class King extends ChessMenAction {
        King() {
            super("King", "\u2654", "7", "4");
        }

        public void execute() {
            // TODO: 19.07.2016
        }
    }
    public class Queen extends ChessMenAction {
        Queen() {
            super("Queen", "\u2655", "7", "3");
        }

        public void execute() {
            // TODO: 19.07.2016
        }
    }
    public class Rook extends ChessMenAction {
        Rook(String line, String column) {
            super("Rook", "\u2656", line, column);
        }

        public void execute() {
            // TODO: 19.07.2016
        }
    }
    public class Bishop extends ChessMenAction {
        Bishop(String line, String column) {
            super("Bishop", "\u2657", line, column);
        }

        public void execute() {
            // TODO: 19.07.2016
        }
    }
    public class Knight extends ChessMenAction {
        Knight(String line, String column) {
            super("Knight", "\u2658", line, column);
        }

        public void execute() {
            // TODO: 19.07.2016
        }
    }
    public class Pawn extends ChessMenAction {
        Pawn(String line, String column) {
            super("Pawn", "\u2659", line, column);
        }

        public void execute() {
            // TODO: 19.07.2016
        }
    }
}
