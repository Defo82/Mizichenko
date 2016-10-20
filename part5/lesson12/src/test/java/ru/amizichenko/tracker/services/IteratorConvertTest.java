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
    public void whenConvertGetIteratorOfIteratorsThanReturnIteratorOfInteger() {
        IteratorEvenNumbers ien = new IteratorEvenNumbers(new int[] {1,1,1,2,1,1,4});
        IteratorOfIterators ioi = new IteratorOfIterators(new Iterator[]{ien});
        IteratorConvert ic = new IteratorConvert<Integer>();

        Iterator<Integer> result = ic.convert(ioi);

        assertThat(result.next(), is(2));
    }

}