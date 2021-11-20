package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenTruePosition() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Assert.assertEquals(Cell.C1, bb.position());
    }

    @Test
    public void whenTrueCopy() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Figure bb2 = bb.copy(Cell.E3);
        Assert.assertEquals(Cell.E3, bb2.position());
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWrongWay() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        bb.way(Cell.G6);
    }
}