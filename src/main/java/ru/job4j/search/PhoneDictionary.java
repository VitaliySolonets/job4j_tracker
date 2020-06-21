package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, которые содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person current : this.persons) {
            if (current.getAddress().contains(key)
                    || current.getName().contains(key)
                    || current.getPhone().contains(key)
                    || current.getSurname().contains(key)) {
                result.add(current);
            }
        }
        return result;
    }
}
