package ru.amizichenko.chess;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Defo on 18.08.2016.
 */
public class PawnTest {


    AllChessMen all = new AllChessMen();
    Figure pawn = all.new Pawn(new Cell(6, 0), true);
    Cell distance = new Cell(4, 0);


    @Test
    public void whenMethodGetTargetCellThenMethodReturnsArrayFromCellToFigure() {
        Cell[] arr = pawn.conditionClearWayTo(distance);
        assertThat(arr.length, is(2));
        assertThat(arr[0].getLine(), is(4));
        assertThat(arr[0].getColumn(), is(0));
    }

    @Test
    public void methodReturnsArrayOfCellsWhichFigureCanGo() {
        Cell[] arr = pawn.conditionCorrectFiguresWay();
        assertThat(arr[0].getLine(), is(5));
        assertThat(arr[0].getColumn(), is(0));
    }

    @Test
    public void whenPawnNotStartLinePosition() {
        Figure pawn = all.new Pawn(new Cell(5, 0), true);
        Cell[] arr = pawn.conditionCorrectFiguresWay();
        assertThat(arr[1], is(nullValue()));
        assertThat(arr[0].getLine(), is(4));
        assertThat(arr[0].getColumn(), is(0));
    }

}