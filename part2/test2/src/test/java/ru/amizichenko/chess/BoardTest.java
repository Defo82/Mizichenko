package ru.amizichenko.chess;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Defo on 07.08.2016.
 */
public class BoardTest {
    @Test
    public void checkWay() throws Exception {
        Cell[] way = new Cell[1];
        way[0] = new Cell(4, 0);
        Board board = new Board();

        boolean check = board.checkWay(way);

        assertThat(check, is(true));
    }

}