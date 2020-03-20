package ru.job4j.tracker;

public class EditItem implements UserAction {
    @Override
    public String name() {
        return "=== Edit an item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Please, enter id: ");
        String name = input.askStr("Please, enter name: ");
        boolean edit = tracker.replace(id, new Item(name));
        if (edit) {
            System.out.println("Item edited.");
        } else {
            System.out.println("Operation failed.");
        }
        return true;
    }
}
