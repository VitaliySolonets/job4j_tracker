package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "===Delete Item===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Please,enter the id.");
        boolean delete = tracker.delete(id);
        if (delete) {
            System.out.println("Operation is  " + delete + " Thanks. Item deleted.");
        } else {
            System.out.println("The operation failed.");
        }
        return true;
    }
}
