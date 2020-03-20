package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "===Find item by id===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Please,enter the id.");
        Item item = tracker.findById(id);
        System.out.println(item != null ? item.getName() : "Invalid id.");
        return true;
    }
}
