package ru.job4j.tracker;

public class ShowAllItems implements UserAction {
    @Override
    public String name() {
        return "===Show all Items===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item);
        }

      /*  Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }*/
        return true;
    }
}
