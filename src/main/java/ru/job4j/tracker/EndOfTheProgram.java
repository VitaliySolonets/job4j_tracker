package ru.job4j.tracker;

public class EndOfTheProgram implements UserAction {
    @Override
    public String name() {
        return "===Exit===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Good bay!!!");
        return false;
    }
}
