package ru.amizichenko.tracker.lists;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Defo on 08.01.2017.
 */
public class SimpleLinkedListTest {

    @Test
    public void useSimpleLinkedList() {
        SimpleLinkedList<String> usa = new SimpleLinkedList<String>();

        //добавим несколько элементов в список.
        usa.addFirst("California");
        usa.addLast("Texas");
        usa.add("Florida");

        //Узнаем количество элементов.
        System.out.printf("В списке %d элементов \n", usa.size());
        assertThat(usa.size(), is(3));

        //Проверим наличие элемента в списке.
        assertThat(usa.getFirst(), is("California"));

    }



}