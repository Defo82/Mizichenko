package ru.amizichenko.tracker.services;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 18.10.2016.
 */
public class IteratorOfIteratorsTest {

    @Test
    public void whenCreateObjectOfIteratorIteratorsMethodNextReturnsObjectFromConstructor() {
        IteratorEvenNumbers ien = new IteratorEvenNumbers(new int[]{1, 1, 1, 2, 1, 1, 4});
        IteratorOfIterators ioi = new IteratorOfIterators(new Iterator[]{ien});

        Iterator ien2 = ioi.next();

        assertThat(ien2, is(ien));
    }

    @Test
    public void whenCreateObjectOfIteratorIteratorsMethodHasNextReturnsFalse() {
        IteratorEvenNumbers ien = new IteratorEvenNumbers(new int[]{1, 1, 1, 2, 1, 1, 4});
        IteratorOfIterators ioi = new IteratorOfIterators(new Iterator[]{ien});

        Iterator ien2 = ioi.next();
        boolean checkFalse = ioi.hasNext();

        assertThat(checkFalse, is(false));
    }
}