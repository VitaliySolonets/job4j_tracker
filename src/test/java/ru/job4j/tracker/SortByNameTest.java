package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SortByNameTest {
    @Test
    public void whenSortAscending() {
        Item fix = new Item("Fix bug");
        Item reboot = new Item("Reboot server");
        Item implTask = new Item("Impl task");
        List<Item> itemList = Arrays.asList(fix, reboot, implTask);
        Collections.sort(itemList, new SortItemByNameAscending());
        assertThat(itemList, is(new ArrayList<>(Arrays.asList(fix, implTask, reboot))));
    }

    @Test
    public void whenSortDescending() {
        Item fix = new Item("Fix");
        Item reboot = new Item("Reboot Server");
        Item implTask = new Item("Implements Task");
        List<Item> itemList = Arrays.asList(fix, reboot, implTask);
        Collections.sort(itemList, new SortItemByNameDescending());
        assertThat(itemList, is(new ArrayList<>(Arrays.asList(reboot, implTask, fix))));
    }
}
