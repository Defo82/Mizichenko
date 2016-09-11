package ru.amizichenko.tracker.services;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 11.09.2016.
 */
public class IteratorEvenNumbersTest {
    IteratorEvenNumbers it = new IteratorEvenNumbers(new int[] {1,1,1,2,1,1,4});

    @Test
    public void whenGetNextCallShouldReturnEvenNumberAndPointerForward() {
        it.next();
        int resoult = (Integer) it.next();

        assertThat(resoult, is(4));
    }

    @Test
    public void whenCheckNextPositionShouldReturnContentValue() {
        it.next();
        it.next();
        boolean resoult = it.hasNext();

        assertThat(resoult, is(false));
    }


}