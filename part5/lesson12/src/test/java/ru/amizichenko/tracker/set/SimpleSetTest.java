package ru.amizichenko.tracker.set;

import org.junit.Assert;
import org.junit.Test;
import ru.amizichenko.tracker.lists.SimpleArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Defo on 03.03.2017.
 */
public class SimpleSetTest {

    @Test

    public void add() throws Exception {
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

        assertThat(check, is(3));
        }
}

