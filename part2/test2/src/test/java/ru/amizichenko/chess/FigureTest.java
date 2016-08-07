package ru.amizichenko.chess;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by Defo on 07.08.2016.
 */
public class FigureTest {

    Cell pawn = new Cell(6, 0);
    Cell distance = new Cell(4, 0);
    Figure figure = new Figure(pawn);
    Board board = new Board();

    @Test
    public void movePawn() throws Exception {

        Cell[] way = figure.movePawn(distance);

        assertThat(way[0].getLine(), is(4));
        assertThat(way[0].getColumn(), is(0));
    }

    @Test
    public void figureGo() throws Exception {

        figure.figureGo(distance, board.checkWay(figure.movePawn(distance)));

        assertThat(figure.position.getLine(), is(4));
        assertThat(figure.position.getColumn(), is(0));
    }

}