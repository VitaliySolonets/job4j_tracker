package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.isBlank() ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        List<String> list = new ArrayList<>(tmp);
        sortDesc(list);
        return list;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs);
    }
}
