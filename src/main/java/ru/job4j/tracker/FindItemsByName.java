package ru.job4j.tracker;

public class FindItemsByName implements UserAction {
    @Override
    public String name() {
        return "===Find item by name===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Please,enter the name:");
        //System.out.println(Arrays.toString(tracker.findByName(name)));
        Item[] items = tracker.findByName(name);
        for (Item item : items) {
            System.out.println(item);
        }
        return true;
    }
}