package ru.amizichenko.chess;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Defo on 07.08.2016.
 */
public class BoardTest {

    AllChessMen all = new AllChessMen();
    Figure pawn = all.new Pawn(new Cell(6, 0), true);
    Cell distance = new Cell(4, 0);
    Board board = new Board();

    @Test
    public void checkCorrectFiguresWayTest() {
        boolean allow = board.checkCorrectFiguresWay(pawn.conditionCorrectFiguresWay(), distance);
        assertThat(allow, is(true));
    }

    @Test
    public void checkClearWayTest() {
        board.figures[6][0] = pawn;
        boolean allow = board.checkClearWay(pawn.conditionClearWayTo(distance));
        assertThat(allow, is(true));
    }

}