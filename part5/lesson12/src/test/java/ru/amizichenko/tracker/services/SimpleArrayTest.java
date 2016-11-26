package ru.amizichenko.tracker.services;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by defo on 26.11.16.
 */
public class SimpleArrayTest {

    @Test
    public void add() {
        SimpleArray<Integer> sa = new SimpleArray<Integer>(2);
        sa.add(1);
        int result = sa.get(0);
        assertThat(result, is(1));

    }

    @Test
    public void update() {
        SimpleArray<Integer> sa = new SimpleArray<Integer>(1);
        sa.update(0, 2);
        int result = sa.get(0);
        assertThat(result, is(2));


    }

    @Test
    public void delete() {
        SimpleArray<Integer> sa = new SimpleArray<Integer>(1);
        sa.add(1);
        sa.delete(0);
        Assert.assertNull(sa.get(0));

    }

    @Test
    public void get() {
        SimpleArray<String> sa = new SimpleArray<String>(1);
        sa.add("text");
        String result = sa.get(0);
        assertThat(result, is("text"));

    }

}