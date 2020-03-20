package ru.job4j.tracker;

public interface UserAction {
    String name();

    //Метод execute возвращает boolean переменную.Чтобы создать действия выхода из программы.
    //Если false, то считаем что пользователь вышел из программы.
    boolean execute(Input input, Tracker tracker);
}
