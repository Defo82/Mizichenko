package ru.amizichenko.tracker.lists;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by defo on 13.12.16.
 */
public class SimpleArrayListTest {
    @Test
    public void add() throws Exception {
        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>(1);
        simpleArrayList.add(1);
        simpleArrayList.add(2);

        int result = simpleArrayList.get(1);

        assertThat(result, is(2));
    }


}