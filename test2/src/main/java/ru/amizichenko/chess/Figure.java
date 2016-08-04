package ru.amizichenko.chess;

/**
 * Created by Defo on 03.08.2016.
 */
public class Figure extends Cell {

    public Cell[] movePawn(Cell distance) {

        Cell[] way = new Cell[4];
        //пешка ходит
        way[0] = new Cell(this.getLine()-1,this.getColumn());
        way[1] = new Cell(this.getLine()-2,this.getColumn());

        //пешка бьет если тут черные
        way[2] = new Cell(this.getLine()-1,this.getColumn()-1);
        way[3] = new Cell(this.getLine()-1,this.getColumn()+1);

        return way;

    }

}
