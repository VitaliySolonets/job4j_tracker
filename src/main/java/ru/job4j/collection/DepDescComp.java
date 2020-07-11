package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = o1.compareTo(o2);
        if (result == 0) {
            result = Integer.compare(o1.length(), o2.length());
        }
        return result;
    }
}


