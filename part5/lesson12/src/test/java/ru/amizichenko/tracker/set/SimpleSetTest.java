package ru.amizichenko.tracker.set;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 03.03.2017.
 */
public class SimpleSetTest {

    @Test
    public void WhenScrollThrowSetEachElementIsUnique() throws Exception {
        SimpleSet<Integer> simpleSet = new SimpleSet<>(10);
        simpleSet.add(1);
        simpleSet.add(1);
        simpleSet.add(2);
        simpleSet.add(2);
        simpleSet.add(3);
        simpleSet.add(3);

        simpleSet.next();                   //1
        simpleSet.next();                   //2
        int check = simpleSet.next();       //3

        MatcherAssert.assertThat(check, is(3));
        }
}

