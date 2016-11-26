package ru.amizichenko.tracker.services;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by defo on 24.11.16.
 */
class SimpleListTest {

    @Test
    public void whenCreateConteinerShouldReturnTheSameType() {
        SimpleList<String> simple = new SimpleList<String>(4);
        simple.add("text");
        String result = simple.get(1);
        assertThat(result, is("text"));
    }

    @Test
    public void whenTypeIntShouldReturnInt() {
        SimpleList<String> simple = new SimpleList<String>(4);
        simple.add("text");
        String result = simple.get(1);
        assertThat(result, is("text"));
    }

}
