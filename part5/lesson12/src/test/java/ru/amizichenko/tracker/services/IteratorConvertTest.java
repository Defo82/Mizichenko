package ru.amizichenko.tracker.services;

import org.junit.Test;

import java.util.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 20.10.2016.
 */
public class IteratorConvertTest {

    @Test
    public void whenItHasOneThenReturnTwo() {
        Iterator<Integer> first = Arrays.asList(1).iterator();
        Iterator<Integer> second = Arrays.asList(2).iterator();
        Iterator<Iterator<Integer>> it = Arrays.asList(first, second).iterator();
        Iterator<Integer> result = new IteratorConvert().convert(it);

        result.next(); // 1
        int value = result.next();
        assertThat(value, is(2));
    }

}