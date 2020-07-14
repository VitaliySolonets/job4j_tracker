package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] firstParts = o1.split("/");
        String[] secondParts = o2.split("/");
        int tmp = secondParts[0].compareTo(firstParts[0]);
        return tmp != 0 ? tmp : o1.compareTo(o2);
    }
}


