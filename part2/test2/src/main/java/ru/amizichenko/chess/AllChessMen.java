package ru.amizichenko.chess;

/**
 * Created by Defo on 10.08.2016.
 * Класс содержит классы фигур
 */
public class AllChessMen {

    private class Pawn extends Figure {
        /**
         * Метод возвращает путь для пешки
         * @param distance клетка на которую нужно пойти
         * @return массив клеток от текущего положения фигуры до distance
         */
        public Cell[] move(Cell distance) {

            Cell[] way = new Cell[2];
            int distLine = distance.getLine(); // для инкремента

            if (this.sideOfColor) {
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
    }

    private class Knight extends Figure {
        public Cell[] move(Cell distance) {
            Cell[] way = new Cell[7];
            return way;
        }
    }

    private class Bishop extends Figure {
        /**
         * Метод возвращает путь для слона
         * @param distance клетка на которую нужно пойти
         * @return массив клеток от текущего положения фигуры до distance
         */
        public Cell[] move(Cell distance) {
            Cell[] way = new Cell[7];
            int distLine = distance.getLine();
            int distColumn = distance.getColumn();

            if (this.position.getLine() > distance.getLine()) {
                if (this.position.getColumn() > distance.getColumn()) {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine++, distColumn++);
                        }
                    }
                } else {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine++, distColumn--);
                        }
                    }
                }
            } else {
                if (this.position.getColumn() > distance.getColumn()) {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine--, distColumn++);
                        }
                    }
                } else {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine--, distColumn--);
                        }
                    }
                }
            }
            return way;
        }
    }

    private class Rook extends Figure {
        /**
         * Метод возвращает путь для ладьи
         * @param distance клетка на которую нужно пойти
         * @return массив клеток от текущего положения фигуры до distance
         */
        public Cell[] move(Cell distance) {
            Cell[] way = new Cell[7];
            int distLine = distance.getLine();
            int distColumn = distance.getColumn();

            if (this.position.getLine() == distance.getLine()) {
                if (this.position.getColumn() > distance.getColumn()) {
                    while (this.position.getColumn() != distColumn) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine, distColumn++);
                        }
                    }
                } else {
                    while (this.position.getColumn() != distColumn) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine, distColumn--);
                        }
                    }
                }
            }

            if (this.position.getColumn() == distance.getColumn()) {
                if (this.position.getLine() > distance.getLine()) {
                    while (this.position.getLine() != distLine) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine++, distColumn);
                        }
                    }
                } else {
                    while (this.position.getLine() != distLine) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine--, distColumn);
                        }
                    }
                }
            }
            return way;
        }
    }

    private class Queen extends Figure {
        /**
         * Метод возвращает путь для ферзя
         * @param distance клетка на которую нужно пойти
         * @return массив клеток от текущего положения фигуры до distance
         */
        public Cell[] move(Cell distance) {
            Cell[] way = new Cell[7];
            int distLine = distance.getLine();
            int distColumn = distance.getColumn();

            if (this.position.getLine() > distance.getLine()) {
                if (this.position.getColumn() > distance.getColumn()) {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine++, distColumn++);
                        }
                    }
                } else {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine++, distColumn--);
                        }
                    }
                }
            } else {
                if (this.position.getColumn() > distance.getColumn()) {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine--, distColumn++);
                        }
                    }
                } else {
                    while (this.position.getLine() != distLine){
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine--, distColumn--);
                        }
                    }
                }
            }

            if (this.position.getLine() == distance.getLine()) {
                if (this.position.getColumn() > distance.getColumn()) {
                    while (this.position.getColumn() != distColumn) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine, distColumn++);
                        }
                    }
                } else {
                    while (this.position.getColumn() != distColumn) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine, distColumn--);
                        }
                    }
                }
            }

            if (this.position.getColumn() == distance.getColumn()) {
                if (this.position.getLine() > distance.getLine()) {
                    while (this.position.getLine() != distLine) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine++, distColumn);
                        }
                    }
                } else {
                    while (this.position.getLine() != distLine) {
                        for (int i = 0; i < way.length; i++) {
                            way[i] = new Cell(distLine--, distColumn);
                        }
                    }
                }
            }

            return way;
        }
    }

    private class King extends Figure {
        /**
         * Метод возвращает путь для короля
         * @param distance клетка на которую нужно пойти
         * @return массив клеток от текущего положения фигуры до distance
         */
        public Cell[] move(Cell distance) {
            Cell[] way = new Cell[1];
            if ((distance.getLine() <= this.position.getLine()-1 && distance.getLine() >= this.position.getLine()+1) &&
                    (distance.getColumn() <= this.position.getColumn()-1 && distance.getColumn() >= this.position.getColumn()+1)) {
                        way[0] = new Cell(distance.getLine(), distance.getColumn());
            }
            return way;
        }
    }

}
