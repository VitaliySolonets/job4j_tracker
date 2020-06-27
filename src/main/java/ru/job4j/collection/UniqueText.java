package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String value:origin){
            check.add(value);
        }
        for (String textValue:text){
            for (String checkValue:check){
                if (checkValue.contains(textValue)) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }
}
