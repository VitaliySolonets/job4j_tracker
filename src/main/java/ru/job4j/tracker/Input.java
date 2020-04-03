package ru.job4j.tracker;

/**
 * Определяет работу класса по получению данных от пользователя в консоли.
 */
public interface Input {
    /**
     * Метод возвращает введеную строку от пользователя.
     */
    String askStr(String question);

    /**
     * Возвращает число а не строку.
     */
    int askInt(String question);

    /**
     * Запрашивает число пока пользователь не введет число от 0 до max.
     */
    int askInt(String question, int max);
}
