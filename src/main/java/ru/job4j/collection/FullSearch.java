package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> number = new HashSet<>();
        for (Task value : list) {
            number.add(value.getNumber());
        }
        return number;
    }
}
