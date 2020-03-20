package ru.job4j.tracker;


/**
 * Консольное приложение для работы с классом ru.job4j.tracker.Tracker.
 */

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ",actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        //создаем массив с действиями.
        UserAction[] actions = {
                new CreateAction(),
                new DeleteItem(),
                new EditItem(),
                new FindItemById(),
                new FindItemsByName(),
                new ShowAllItems(),
                new EndOfTheProgram()
        };
        new StartUI().init(input, tracker, actions);
    }
}
