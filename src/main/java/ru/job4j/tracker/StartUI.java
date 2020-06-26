package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Консольное приложение для работы с классом ru.job4j.tracker.Tracker.
 */

public class StartUI {

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        //создаем массив с действиями.
        List<UserAction> actions = new ArrayList<>();
        Arrays.asList(new CreateAction(),
                new DeleteItem(),
                new EditItem(),
                new FindItemById(),
                new FindItemsByName(),
                new ShowAllItems(),
                new EndOfTheProgram())
        ;
        new StartUI().init(validate, tracker, actions);
    }
}
