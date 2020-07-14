package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String element : value.split("/")) {
                start = start.isBlank() ? element : start + "/" + element;
                tmp.add(start);
            }
        }
        List<String> list = new ArrayList<>(tmp);
        sortAscending(list);
        return list;
    }

    public static void sortAscending(List<String> orgs) {
        Collections.sort(orgs, Comparator.naturalOrder());
    }

    public static void sortDescending(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }
}
