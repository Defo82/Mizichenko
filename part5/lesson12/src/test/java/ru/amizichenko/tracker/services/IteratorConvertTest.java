package ru.amizichenko.tracker.services;

import org.junit.Test;

import java.util.Iterator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 20.10.2016.
 */
public class IteratorConvertTest {

    @Test
    public void whenConvertGetArrayOfIteratorsReturnsDigitsFromAll() {
        Iterator<Integer> ien = new IteratorEvenNumbers(new int[] {1,1,1,2,1,1,4});
        Iterator<Integer> ipn = new IteratorPrimeNumbers(new int[] {1,1,1,2,1,1,3});
        Iterator<Iterator<Integer>> ioi = new IteratorOfIterators(new Iterator[] {ien, ipn});
        IteratorConvert ic = new IteratorConvert();

        int firstValue = ic.convert(ioi).next();
        int secondValue = ic.convert(ioi).next();
        int thirdValue = ic.convert(ioi).next();
        int fourthValue = ic.convert(ioi).next();

        assertThat(firstValue, is(2));
        assertThat(secondValue, is(4));
        assertThat(thirdValue, is(2));
        assertThat(fourthValue, is(3));
    }

}