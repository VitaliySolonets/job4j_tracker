package ru.job4j.tracker;

/**
 * @author Vitaly Solonets (Solonets.80@mail.ru)
 * @version 0.1
 * @since 23.08.2019
 */

public class Item {
    private String id;
    private String name;


    public Item(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Id: " + getId();
    }
}
