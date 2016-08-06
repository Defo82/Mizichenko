package ru.amizichenko.tracker.start;
import ru.amizichenko.tracker.models.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class StartUITest {

    @Test
    public void testGetAll() {
        Tracker tracker = new Tracker();
        tracker.add(new Item());

        Item[] ex = tracker.getAll();

        //Длинна возвращенного массива должна равняться количеству элементов в tracker.items
        assertThat(ex.length, is(1));
    }

    @Test
    public void testAdd() {
        Tracker tracker = new Tracker();
        Item item = new Item();

        tracker.add(item);

        assertThat(tracker.getAll()[0], sameInstance(item));
    }

    @Test
    public void testEdit() {
        Tracker tracker = new Tracker();
        tracker.add(new Item());

        tracker.edit(new Item(tracker.getAll()[0].getId(),"NAME","DESC"));

        assertThat(tracker.getAll()[0], notNullValue());
        assertThat(tracker.getAll()[0].getName(), is("NAME"));
        assertThat(tracker.getAll()[0].getDescription(), is("DESC"));
    }

    @Test
    public void testRemove() {
        Tracker tracker = new Tracker();
        //В массив отправилось 2 объекта,
        tracker.add(new Item());
        tracker.add(new Item());

        tracker.remove(tracker.getAll()[0].getId());
        // а вернулся 1
        assertThat(tracker.getAll().length, equalTo(1));
    }

    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("NAME","DESC"));

        Item returned = tracker.findById(tracker.getAll()[0].getId());

        assertThat(returned.getName(), is("NAME"));
        assertThat(returned.getDescription(), is("DESC"));
    }

    @Test
    public void testSort() {
        Tracker tracker = new Tracker();
        tracker.add(new Item(" ", " "));
        tracker.add(new Item("a", " "));
        tracker.add(new Item(" ", "a"));


        Item[] expected = tracker.sort("a");

        assertThat(tracker.getAll().length, equalTo(3));
        assertThat(expected[0].getName(), is("a"));
        assertThat(expected[1].getDescription(), is("a"));
    }
}