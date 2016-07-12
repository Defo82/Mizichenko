package ru.amizichenko.tracker.start;
import org.junit.Assert;
import ru.amizichenko.tracker.models.*;
import org.junit.Test;

public class StartUITest {
    @Test
    public void testAdd() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        Item[] check = new Item[1];
        check[0]= item;

        tracker.add(item);

        Assert.assertSame(tracker.items[0], check[0]);
    }

    @Test
    public void testEdit() {
        Tracker tracker = new Tracker();
        tracker.items[0] = new Item("1","name","desc");
        Item item = new Item("1","name","desc");

        tracker.edit(item);

        Assert.assertNotNull(tracker.items[0]);
        Assert.assertSame(tracker.items[0], item);
    }

    @Test
    public void testRemove() {
        Tracker tracker = new Tracker();
        tracker.items[0] = new Item("1","name","desc");

        tracker.remove("1");

        Assert.assertNull(tracker.items[0]);
    }

    @Test
    public void testFindById() {
        Tracker tracker = new Tracker();
        Item ex = new Item("1","name","desc");
        tracker.items[0] = ex;

        tracker.findById("1");

        Assert.assertSame(tracker.items[0], ex);
    }

    @Test
    public void testGetAll() {
        Tracker tracker = new Tracker();
        tracker.add(new Item());

        Item[] ex = tracker.getAll();

        //Длинна возвращенного массива должна равняться количеству элементов в tracker.items
        Assert.assertTrue(ex.length == 1);
    }

    @Test
    public void testSort() {
        Tracker tracker = new Tracker();
        tracker.items[0] = tracker.add(new Item("a", " "));
        tracker.items[1] = tracker.add(new Item(" ", "a"));

        Item[] ex = tracker.sort("a");

        Assert.assertSame(tracker.items[0], ex[0]);
        Assert.assertSame(tracker.items[1], ex[1]);
    }
}
