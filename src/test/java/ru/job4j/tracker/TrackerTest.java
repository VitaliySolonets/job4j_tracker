package ru.job4j.tracker;

import org.junit.Test;


import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1");
        tracker.add(previous);
        Item next = new Item("test2");
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItemThenNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        tracker.add(item);
        boolean result = tracker.delete(item.getId());
        assertThat(result, is(true));
    }

    @Test

    public void whenFindAllThenItemsFourElementNotIncludeNull() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item1 = new Item("test2");
        Item item2 = new Item("test3");
        Item item3 = new Item("test4");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        assertThat(tracker.findAll().size(), is(4));
    }

    @Test

    public void whenFindByNameThenReturnItemsSameName() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("test0");
        Item item1 = new Item("test1");
        Item item2 = new Item("test0");
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> result = tracker.findByName("test0");
        for (Item item : result) {
            assertThat(item.getName(), is("test0"));
        }
    }

    @Test

    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        String result = item1.getId();
        assertThat(tracker.findById(result), is(item1));
    }

}


