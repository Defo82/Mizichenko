package ru.amizichenko.tracker.services;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 17.09.2016.
 */
public class IteratorPrimeNumbersTest {

    @Test
    public void whenGetNextCallShouldReturnPrimeNumberAndPointerForward() {
        IteratorPrimeNumbers it = new IteratorPrimeNumbers(new int[] {1,1,1,2,1,1,3});
        it.next();
        int resoult = (Integer) it.next();

        assertThat(resoult, is(3));
    }

    @Test
    public void whenCheckNextPositionShouldReturnContentValue() {
        IteratorPrimeNumbers it = new IteratorPrimeNumbers(new int[] {1,1,1,2,1,1,3});
        it.next();
        it.next();

        boolean resoult = it.hasNext();

        assertThat(resoult, is(false));
    }



}