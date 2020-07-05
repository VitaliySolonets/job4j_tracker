package ru.job4j.collection;

import java.util.Comparator;

public class JobDescendingByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return Integer.compare(second.getName().length(), first.getName().length());
    }
}
